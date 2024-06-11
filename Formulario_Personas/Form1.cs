namespace Formulario_Personas
{
    public partial class Form1 : Form
    {


      
        
        public Form1()
        {
            
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void buttonAceptar_Click(object sender, EventArgs e)
        {
            
            escribirArchivo(userInterfaceToData().toString());
        }

        private Modelo userInterfaceToData()
        {
            String name = textNombre.Text;
            String ap1 = textAp1.Text;
            String ap2 = textAp2.Text;
            String nac = textNacimiento.Text;
            String dep = textDeporte.Text;
            Boolean beca =checkBeca.Checked;
            return new Modelo(name, ap1, ap2, nac, dep, beca);
        }


        private void dataToUserInterface()
        {
            textNombre.ResetText();
            textAp1.ResetText();
            textAp2.ResetText();
            textNacimiento.ResetText();
            textDeporte.ResetText();
            

        }

        private void buttonLimpiar_Click(object sender, EventArgs e)
        {
            dataToUserInterface();
            textNombre.Focus();
        }

        public void escribirArchivo(String data)
        {
            String name = "4A.ss.txt";
            if (!File.Exists(name))
            {
                File.Create(name);
            }


            using (StreamWriter escritor = new StreamWriter(name, true))
            {
                escritor.WriteLine(data);
            }
           

        }
        
    }
}
