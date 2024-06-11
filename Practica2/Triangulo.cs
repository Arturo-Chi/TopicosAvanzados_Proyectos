using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Drawing;
using System.Windows.Forms;
using System.Drawing.Drawing2D;

namespace Practica2
{
    public class Triangulo : Control
    {
        protected override void OnPaint(PaintEventArgs e)
        {
            base.OnPaint(e);
            GraphicsPath path = new GraphicsPath();
            path.AddPolygon(new Point[]
            {
            new Point(ClientRectangle.Width / 2, 0),
            new Point(0, ClientRectangle.Height),
            new Point(ClientRectangle.Width, ClientRectangle.Height)
            });
            e.Graphics.FillPolygon(Brushes.Red, path.PathPoints);
        }
    }
}
