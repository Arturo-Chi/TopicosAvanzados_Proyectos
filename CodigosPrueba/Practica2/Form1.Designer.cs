namespace Practica2
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.contDestino = new System.Windows.Forms.Panel();
            this.btnSubir = new System.Windows.Forms.Button();
            this.btnIzquierda = new System.Windows.Forms.Button();
            this.btnDerecha = new System.Windows.Forms.Button();
            this.btnAbajo = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // contDestino
            // 
            this.contDestino.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(255)))), ((int)(((byte)(128)))));
            this.contDestino.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.contDestino.Dock = System.Windows.Forms.DockStyle.Right;
            this.contDestino.Location = new System.Drawing.Point(177, 0);
            this.contDestino.Name = "contDestino";
            this.contDestino.Size = new System.Drawing.Size(482, 514);
            this.contDestino.TabIndex = 0;
            // 
            // btnSubir
            // 
            this.btnSubir.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnSubir.Location = new System.Drawing.Point(49, 363);
            this.btnSubir.Name = "btnSubir";
            this.btnSubir.Size = new System.Drawing.Size(75, 42);
            this.btnSubir.TabIndex = 1;
            this.btnSubir.Text = "Subir\r\n(w)";
            this.btnSubir.UseVisualStyleBackColor = true;
            this.btnSubir.Click += new System.EventHandler(this.btnSubir_Click);
            // 
            // btnIzquierda
            // 
            this.btnIzquierda.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnIzquierda.Location = new System.Drawing.Point(12, 411);
            this.btnIzquierda.Name = "btnIzquierda";
            this.btnIzquierda.Size = new System.Drawing.Size(75, 42);
            this.btnIzquierda.TabIndex = 2;
            this.btnIzquierda.Text = "Izquierda\r\n(a)";
            this.btnIzquierda.UseVisualStyleBackColor = true;
            this.btnIzquierda.Click += new System.EventHandler(this.btnIzquierda_Click);
            // 
            // btnDerecha
            // 
            this.btnDerecha.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnDerecha.Location = new System.Drawing.Point(96, 411);
            this.btnDerecha.Name = "btnDerecha";
            this.btnDerecha.Size = new System.Drawing.Size(75, 42);
            this.btnDerecha.TabIndex = 3;
            this.btnDerecha.Text = "Derecha\r\n(d)\r\n";
            this.btnDerecha.UseVisualStyleBackColor = true;
            this.btnDerecha.Click += new System.EventHandler(this.btnDerecha_Click);
            // 
            // btnAbajo
            // 
            this.btnAbajo.FlatStyle = System.Windows.Forms.FlatStyle.Popup;
            this.btnAbajo.Location = new System.Drawing.Point(49, 459);
            this.btnAbajo.Name = "btnAbajo";
            this.btnAbajo.Size = new System.Drawing.Size(75, 42);
            this.btnAbajo.TabIndex = 4;
            this.btnAbajo.Text = "Bajar\r\n(s)\r\n";
            this.btnAbajo.UseVisualStyleBackColor = true;
            this.btnAbajo.Click += new System.EventHandler(this.btnAbajo_Click);
            // 
            // Form1
            // 
            this.ClientSize = new System.Drawing.Size(659, 514);
            this.Controls.Add(this.btnAbajo);
            this.Controls.Add(this.btnDerecha);
            this.Controls.Add(this.btnIzquierda);
            this.Controls.Add(this.btnSubir);
            this.Controls.Add(this.contDestino);
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Practica2";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel contDestino;
        private System.Windows.Forms.Button btnSubir;
        private System.Windows.Forms.Button btnIzquierda;
        private System.Windows.Forms.Button btnDerecha;
        private System.Windows.Forms.Button btnAbajo;
    }  
}

