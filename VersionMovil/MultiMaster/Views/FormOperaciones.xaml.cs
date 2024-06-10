using Microsoft.Maui.Controls;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace MultiMaster.Views
{
    public partial class FormOperaciones : ContentPage
    {
        private Persona persona;
        private Cliente cliente;
        private Lector lector;
        private int baseNumber;
        private int currentMultiplier;
        private List<string> problemasgenerados = new List<string>();
        private string claveproblema = "";
        private int problemasResueltos = 0;
        private Random random = new Random();
        private HashSet<int> usedMultiplications = new HashSet<int>();
        private const int TotalSteps = 10;  // Total steps for the progress bar

        public FormOperaciones(Lector lector, Cliente cliente, Persona persona, int baseNumber, string pageTitle)
        {
            InitializeComponent();
            this.persona = persona;
            this.cliente = cliente;
            this.lector = lector;
            this.baseNumber = baseNumber;
            this.Title = pageTitle;  // Set the title of the page
            SetNewMultiplication();
        }

        private async void OnButtonClick(object sender, EventArgs e)
        {
            if (sender is Button button)
            {
                if (int.TryParse(button.Text, out int userResult))
                {
                    int correctResult = baseNumber * currentMultiplier;
                    
                    claveproblema = string.Format($"{baseNumber} x {currentMultiplier}");

                    if (userResult == correctResult)
                    {
                        await ShowMessage("¡El resultado es correcto!");
                        usedMultiplications.Add(currentMultiplier);


                        problemasResueltos++;
                        persona.avances[baseNumber - 1][problemasResueltos - 1] = claveproblema;

                        this.cliente.enviarAlServidor(lector.listaAJson());

                        // Update the progress bar
                        progressBar.Progress = (double)usedMultiplications.Count / TotalSteps;

                        if (usedMultiplications.Count == TotalSteps)
                        {
                            await ShowMessage($"¡Has completado la tabla del {baseNumber}!");
                            usedMultiplications.Clear();
                            progressBar.Progress = 0;
                            await Navigation.PopAsync();
                        }

                        SetNewMultiplication();
                    }
                    else
                    {
                        await ShowMessage("Inténtalo de nuevo.");
                    }
                }
            }
        }

        private async Task ShowMessage(string message)
        {
            Device.BeginInvokeOnMainThread(() =>
            {
                messageLabel.Text = message;
                messageLabel.IsVisible = true;
            });

            await Task.Delay(1000);  // Wait for 1 seconds

            Device.BeginInvokeOnMainThread(() =>
            {
                messageLabel.IsVisible = false;
            });
        }

        private void SetNewMultiplication()
        {
            if (usedMultiplications.Count < TotalSteps)
            {
                do
                {
                    currentMultiplier = random.Next(1, 11);
                } while (usedMultiplications.Contains(currentMultiplier));

                int correctResult = baseNumber * currentMultiplier;

                // Generate two other random numbers close to the correct result
                int randomOffset1 = random.Next(1, 5);
                int randomOffset2 = random.Next(1, 5);
                int wrongResult1 = correctResult + randomOffset1;
                int wrongResult2 = correctResult - randomOffset2;

                // Ensure wrong results are positive numbers
                if (wrongResult2 < 0) wrongResult2 = Math.Abs(wrongResult2) + random.Next(1, 5);

                // Randomly assign correct and wrong results to buttons
                List<int> results = new List<int> { correctResult, wrongResult1, wrongResult2 };
                results.Shuffle();

                buttonOption1.Text = results[0].ToString();
                buttonOption2.Text = results[1].ToString();
                buttonOption3.Text = results[2].ToString();

                string imageName = $"t{baseNumber}_{currentMultiplier}.png";
                displayImage.Source = imageName;

                numerobase.Text = baseNumber.ToString();
                lblNumero2.Text = currentMultiplier.ToString();
            }
        }
    }

    public static class ListExtensions
    {
        private static Random rng = new Random();

        public static void Shuffle<T>(this IList<T> list)
        {
            int n = list.Count;
            while (n > 1)
            {
                n--;
                int k = rng.Next(n + 1);
                T value = list[k];
                list[k] = list[n];
                list[n] = value;
            }
        }
    }
}
