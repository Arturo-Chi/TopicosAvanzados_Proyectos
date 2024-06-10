using Microsoft.Maui.Controls;
using System;
using System.Runtime.Intrinsics.X86;

namespace MultiMaster.Views
{
    public partial class MenuPage : ContentPage
    {

       Cliente cliente;
       Persona persona;
        Lector lector;
        public MenuPage(Persona persona, Cliente cliente, Lector lector)
        {
            InitializeComponent();
            this.persona = persona;
            this.cliente = cliente;
            this.lector = lector;

            Console.WriteLine(persona.nombre);
        }

        

        private void OnBtnUsuarioClicked(object sender, EventArgs e)
        {
            // Código para el evento OnBtnUsuarioClicked
            Navigation.PushAsync(new VentanaAvances(this.persona, this.lector));
        }


        

        private void OnBtnVolumenClicked(object sender, EventArgs e)
        {
            // Código para el evento OnBtnVolumenClicked
        }

        private void OnButtonClicked(object sender, EventArgs e)
        {
            if (sender == btn2)
            {
                 Navigation.PushAsync(new FormOperaciones(this.lector, this.cliente, this.persona, 2, "Tabla del 2"));
            }
            else if (sender == btn3)
            {
                Navigation.PushAsync(new FormOperaciones(this.lector, this.cliente, this.persona, 3, "Tabla del 3"));
            }
            else if (sender == btn4)
            {
                Navigation.PushAsync(new FormOperaciones(this.lector, this.cliente, this.persona, 4, "Tabla del 4"));
            }
            else if (sender == btn5)
            {
                Navigation.PushAsync(new FormOperaciones(this.lector, this.cliente, this.persona, 5, "Tabla del 5"));
            }
            else if (sender == btn6)
            {
                Navigation.PushAsync(new FormOperaciones(this.lector, this.cliente, this.persona, 6, "Tabla del 6"));
            }
            else if (sender == btn7)
            {
                Navigation.PushAsync(new FormOperaciones(this.lector, this.cliente, this.persona, 7, "Tabla del 7"));
            }

        }
        private void OnButtonValidarClicked(object sender, EventArgs e)
        {
            // Código para el evento OnButtonClicked
        }

        private async void OnBtnSalirClicked(object sender, EventArgs e)
        {
            cliente.cerrarConexion();
            await Navigation.PushAsync(new HomePage());
        }





    }

    }

