using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica2
{


    public partial class FormSecundario : Form
    {

        FormPrincipal mein;
        public FormSecundario() //Instanciación de la ventana principal
        {
            InitializeComponent();
        }

        private void btnVolver_Click(object sender, EventArgs e)
        {
            mein = new FormPrincipal();//Inicialización
            this.Close(); //Cerrado de la ventana
            
        }
    }
}
