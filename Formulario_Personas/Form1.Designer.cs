namespace Formulario_Personas
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            labelNombre = new Label();
            textNombre = new TextBox();
            labelApellidos = new Label();
            textAp1 = new TextBox();
            textAp2 = new TextBox();
            labelNacimiento = new Label();
            textNacimiento = new TextBox();
            labelDeporte = new Label();
            textDeporte = new TextBox();
            checkBeca = new CheckBox();
            buttonAceptar = new Button();
            buttonLimpiar = new Button();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("Showcard Gothic", 18F, FontStyle.Regular, GraphicsUnit.Point, 0);
            label1.Location = new Point(339, 20);
            label1.Name = "label1";
            label1.Size = new Size(209, 37);
            label1.TabIndex = 0;
            label1.Text = "FORMULARIO";
            label1.Click += label1_Click;
            // 
            // labelNombre
            // 
            labelNombre.AutoSize = true;
            labelNombre.Location = new Point(88, 82);
            labelNombre.Name = "labelNombre";
            labelNombre.Size = new Size(67, 20);
            labelNombre.TabIndex = 1;
            labelNombre.Text = "Nombre:";
            labelNombre.Click += label2_Click;
            // 
            // textNombre
            // 
            textNombre.Location = new Point(183, 79);
            textNombre.Name = "textNombre";
            textNombre.Size = new Size(460, 27);
            textNombre.TabIndex = 2;
            // 
            // labelApellidos
            // 
            labelApellidos.AutoSize = true;
            labelApellidos.Location = new Point(91, 136);
            labelApellidos.Name = "labelApellidos";
            labelApellidos.Size = new Size(75, 20);
            labelApellidos.TabIndex = 3;
            labelApellidos.Text = "Apellidos:";
            labelApellidos.Click += label3_Click;
            // 
            // textAp1
            // 
            textAp1.Location = new Point(188, 137);
            textAp1.Name = "textAp1";
            textAp1.Size = new Size(176, 27);
            textAp1.TabIndex = 4;
            // 
            // textAp2
            // 
            textAp2.Location = new Point(393, 138);
            textAp2.Name = "textAp2";
            textAp2.Size = new Size(177, 27);
            textAp2.TabIndex = 5;
            // 
            // labelNacimiento
            // 
            labelNacimiento.AutoSize = true;
            labelNacimiento.Location = new Point(88, 193);
            labelNacimiento.Name = "labelNacimiento";
            labelNacimiento.Size = new Size(89, 20);
            labelNacimiento.TabIndex = 6;
            labelNacimiento.Text = "Nacimiento:";
            // 
            // textNacimiento
            // 
            textNacimiento.Location = new Point(188, 190);
            textNacimiento.Name = "textNacimiento";
            textNacimiento.Size = new Size(460, 27);
            textNacimiento.TabIndex = 7;
            // 
            // labelDeporte
            // 
            labelDeporte.AutoSize = true;
            labelDeporte.Location = new Point(91, 254);
            labelDeporte.Name = "labelDeporte";
            labelDeporte.Size = new Size(67, 20);
            labelDeporte.TabIndex = 8;
            labelDeporte.Text = "Deporte:";
            labelDeporte.Click += label4_Click;
            // 
            // textDeporte
            // 
            textDeporte.Location = new Point(192, 254);
            textDeporte.Name = "textDeporte";
            textDeporte.Size = new Size(254, 27);
            textDeporte.TabIndex = 9;
            // 
            // checkBeca
            // 
            checkBeca.AutoSize = true;
            checkBeca.Location = new Point(91, 312);
            checkBeca.Name = "checkBeca";
            checkBeca.Size = new Size(63, 24);
            checkBeca.TabIndex = 11;
            checkBeca.Text = "Beca";
            checkBeca.UseVisualStyleBackColor = true;
            checkBeca.CheckedChanged += checkBox1_CheckedChanged;
            // 
            // buttonAceptar
            // 
            buttonAceptar.Location = new Point(177, 383);
            buttonAceptar.Name = "buttonAceptar";
            buttonAceptar.Size = new Size(94, 29);
            buttonAceptar.TabIndex = 12;
            buttonAceptar.Text = "Aceptar";
            buttonAceptar.UseVisualStyleBackColor = true;
            buttonAceptar.Click += buttonAceptar_Click;
            // 
            // buttonLimpiar
            // 
            buttonLimpiar.Location = new Point(428, 383);
            buttonLimpiar.Name = "buttonLimpiar";
            buttonLimpiar.Size = new Size(94, 29);
            buttonLimpiar.TabIndex = 13;
            buttonLimpiar.Text = "Limpiar";
            buttonLimpiar.UseVisualStyleBackColor = true;
            buttonLimpiar.Click += buttonLimpiar_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(buttonLimpiar);
            Controls.Add(buttonAceptar);
            Controls.Add(checkBeca);
            Controls.Add(textDeporte);
            Controls.Add(labelDeporte);
            Controls.Add(textNacimiento);
            Controls.Add(labelNacimiento);
            Controls.Add(textAp2);
            Controls.Add(textAp1);
            Controls.Add(labelApellidos);
            Controls.Add(textNombre);
            Controls.Add(labelNombre);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private TextBox textNombre;
        private Label label3;
        private TextBox textBox1;
        private TextBox textBox2;
        private Label labelNacimiento;
        private TextBox textNacimiento;
        private Label labelDeporte;
        private TextBox textDeporte;
        private Label labelBeca;
        private CheckBox checkBeca;
        private Button buttonAceptar;
        private Button buttonLimpiar;
        private Label labelNombre;
        private TextBox textAp1;
        private TextBox textAp2;
        private Label labelApellidos;

    }
}
