using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.InteropServices;
using System.Runtime.Remoting.Messaging;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica2
{
    public partial class Form1 : Form
    {
        private bool down = false;
        private Point inicial;
        private Control aux;
        private int escala = 15;

        public Form1()
        {
            InitializeComponent();

            this.KeyPreview = true; // Permitir que el formulario reciba eventos de teclado
            this.KeyPress += Form1_KeyPress; // Asociar el evento de presionar tecla al formulario
            this.Focus(); // Asegurarse de que el formulario tiene el foco para recibir eventos de teclado

            Circulo circleControl = new Circulo();
            circleControl.Size = new Size(80, 80);
            circleControl.Location = new Point(50, 50);

            circleControl.MouseDown += Ctr_MouseDown;
            circleControl.MouseMove += Ctr_MouseMove;
            circleControl.MouseUp += Ctr_MouseUp;
            Controls.Add(circleControl);

            Triangulo t = new Triangulo();
            t.Size = new Size(80, 80);
            t.Location = new Point(50, 150);
            t.MouseDown += Ctr_MouseDown;
            t.MouseMove += Ctr_MouseMove;
            t.MouseUp += Ctr_MouseUp;
            Controls.Add(t);

            Cuadrado c = new Cuadrado();
            c.Size = new Size(80, 80);
            c.Location = new Point(50, 250);
            c.MouseDown += Ctr_MouseDown;
            c.MouseMove += Ctr_MouseMove;
            c.MouseUp += Ctr_MouseUp;
            Controls.Add(c);
        }

        private void Ctr_MouseDown(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Left)
            {
                down = true;
                inicial = e.Location;
                aux = (Control)sender;
                aux.BringToFront();
            }
        }

        private void Ctr_MouseMove(object sender, MouseEventArgs e)
        {
            if (down)
            {
                Control ctr = (Control)sender;
                ctr.Left = e.X + ctr.Left - inicial.X;
                ctr.Top = e.Y + ctr.Top - inicial.Y;
            }
        }

        private void Ctr_MouseUp(object sender, MouseEventArgs e)
        {
            down = false;
        }

        private void Form1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (aux != null)
            {
                switch (e.KeyChar)
                {
                    case 'a':
                        aux.Left -= escala;
                        break;
                    case 'd':
                        aux.Left += escala;
                        break;
                    case 'w':
                        aux.Top -= escala;
                        break;
                    case 's':
                        aux.Top += escala;
                        break;
                }
            }
        }

        private void btnSubir_Click(object sender, EventArgs e)
        {
            if (aux != null)
            {
                aux.Top -= escala;
                aux.Focus();
            }
        }

        private void btnIzquierda_Click(object sender, EventArgs e)
        {
            if (aux != null)
            {
                aux.Left -= escala;
                aux.Focus();
            }
        }

        private void btnDerecha_Click(object sender, EventArgs e)
        {
            if (aux != null)
            {
                aux.Left += escala;
                aux.Focus();
            }
        }

        private void btnAbajo_Click(object sender, EventArgs e)
        {
            if (aux != null)
            {
                aux.Top += escala;
                aux.Focus();
            }
        }
    }
}
