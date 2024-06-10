namespace MultiMaster.Views;

public partial class VentanaAvances : ContentPage
{

	Persona persona;
    Lector lector;
	public VentanaAvances(Persona persona, Lector lector)
	{
		InitializeComponent();
		this.persona = persona;
		this.lector = lector;
		this.lab_Usuario.Text = persona.nombre;

        prog1.Progress = actualizarDatos(1);
        prog2.Progress = actualizarDatos(2);
        prog3.Progress = actualizarDatos(3);
        prog4.Progress = actualizarDatos(4);
        prog5.Progress = actualizarDatos(5);

        prog6.Progress = actualizarDatos(6);
        prog7.Progress = actualizarDatos(7);
        prog8.Progress = actualizarDatos(8);
        prog9.Progress = actualizarDatos(9);
        prog10.Progress = actualizarDatos(10);
    }


    public double actualizarDatos(int tabla)
    {
        int contador = 0;
        for (int i = 0; i < 10; i++)
        {
            if (!buscar().avances[tabla - 1][i].Equals("0"))
            {
                contador += 1;
            }
           
        }
        return (double)contador/10;

    }

    public Persona buscar()
    {
        //getNombre().Equals(persona.getNombre()
        Persona aux = null;
        foreach (Persona p in lector.getLista())
        {
            if (p.nombre.Equals(persona.nombre))
            {
                aux = p;
            }
        }
        return aux;
    }
}