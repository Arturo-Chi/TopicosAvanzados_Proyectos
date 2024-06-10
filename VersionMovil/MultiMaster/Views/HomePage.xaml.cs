using System.Runtime.CompilerServices;
using MultiMaster.Views;

namespace MultiMaster.Views;

public partial class HomePage : ContentPage
{
	

	Cliente cliente;
	Lector lector;
	Persona persona;
	public HomePage()
	{
		InitializeComponent();
		cliente = new Cliente();
		lector = new Lector();
		lector.jsonALista(cliente.getLista());
        List<string> disponible = new List<string>();
        foreach (Persona p in lector.getLista())
		{
			disponible.Add(p.nombre);
		}

		var users = disponible;
		pckUser.ItemsSource = users;

		


	}
	
	private async void OnIngresarClicked(object senter, EventArgs e)
	{
		string usuarioSeleccionado = pckUser.SelectedItem as string;
		if (!string.IsNullOrEmpty(usuarioSeleccionado))
		{
			persona = new Persona();
			persona.nombre = usuarioSeleccionado;

            foreach (Persona aux in lector.getLista())
            {
				if (aux.nombre.Equals(persona.nombre))
				{
					persona = aux;
					break;
				}
            }
			
			Console.WriteLine(persona.nombre);
            await Navigation.PushAsync(new MenuPage(persona, this.cliente, this.lector));
			

		}
		else
		{
            DisplayAlert("Error", "Seleccione un usuario", "OK");
        }

	
		
		/*

		if (!string.IsNullOrEmpty(usuario))
		{
            Lector lector = new Lector();
            Cliente cliente = new Cliente();
            lector.jsonALista(cliente.getLista());

            this.persona = new Persona();
			persona.nombre = usuario;

			bool existente = false;
			foreach (Persona aux in lector.getLista())
			{
				if (aux.nombre.Equals(this.persona.nombre))
				{
					persona = aux;
					existente = true;
					break;
				}
				Console.WriteLine(aux.nombre);
			}

			if (!existente)
			{
				for(int i = 0; i < 10; i++)
				{
					for (int j=0; j<10; j++)
					{
						this.persona.avances[i][j] = "0";
					}
				}
				lector.getLista().Add(persona);
			}*/
            //cliente.enviarAlServidor(lector.listaAJson());
            await Navigation.PushAsync(new MenuPage(persona, cliente, lector));

		/*}
		else
		{

		}
		/*string contraseña = txtContraseña.Text;
		if (usuario == "admin" && contraseña == "123")
		{
			DisplayAlert("BIENVENIDO", "Haz ingresado correctamente", "OK");
			await Navigation.PushAsync(new MenuPage());
		}
		else
		{
			DisplayAlert("Error", "Usuario o contraseña incorrectos", "OK");
		}*/

	}
    private void OnBorrarClicked(object sender, EventArgs e)
    {
		
        //txtContraseña.Text = "";
    }
}