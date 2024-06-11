using System;
using System.Drawing.Text;
using System.Runtime.CompilerServices;
using System.Runtime.Intrinsics.Arm;

public class Modelo:Form
{
	private String nombre;
	private String apell1;
	private String appell2;
	private String nacimiento;
	private Boolean beca;
	private String deporte;


	public Modelo()
	{
        this.nombre = "";
        this.apell1 = "";
        this.appell2 = "";
        this.nacimiento = "";
        this.deporte = "";
        this.beca = false;
    }


	public Modelo(String nombre, String ap1, String ap2, String nac, String dep, Boolean beca)
	{
		this.nombre = nombre;
		this.apell1 = ap1;
		this.appell2 = ap2;
		this.nacimiento = nac;
		this.deporte = dep;
		this.beca = beca;

	}



	public String toString()
	{
		return this.nombre +" | "+this.apell1 + " | " +this.appell2 + " | " +this.nacimiento + " | " +this.deporte + " | " +
			beca;
	}
}
