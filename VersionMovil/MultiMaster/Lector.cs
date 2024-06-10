using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace MultiMaster
{
    public class Lector
    {
        public List<Persona> usuarios = new List<Persona>();

        public Lector()
        {
        }

        public List<Persona> getLista()
        {
            return usuarios;
        }

        public void setLista(List<Persona> usuarios)
        {
            this.usuarios = usuarios;
        }



        public void jsonALista(string cadena)
        {

            try
            {
                if (!string.IsNullOrEmpty(cadena))
                {
                    Console.WriteLine(cadena);
                    usuarios = JsonConvert.DeserializeObject<List<Persona>>(cadena);
                    //foreach (Persona p in usuarios)
                    //{
                      //  Console.Write(p.nombre);
                    //}
                }
                else
                {
                    Console.WriteLine("La cadena está vacía");
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Error al migrar el formato " + e.Message);
            }


        }

        public string listaAJson()
        {
            string json = JsonConvert.SerializeObject(usuarios);

            return json;
        }
    }
}
