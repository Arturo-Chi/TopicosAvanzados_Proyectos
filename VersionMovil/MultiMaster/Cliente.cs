using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Sockets;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;

using Newtonsoft.Json;

namespace MultiMaster
{
    public class Cliente
    {
        private string listaJson;
        private Socket socket;
        private IPEndPoint connect;
        TcpClient client;

        public Cliente()
        {
            /*
            this.connect = new IPEndPoint(IPAddress.Parse("10.0.34.172"), 8088);
            this.listaJson = conectarse();
            //Console.WriteLine(listaJson);
            */
            client = new TcpClient(AddressFamily.InterNetwork);
            client.Connect("192.168.155.191", 8088);
            client.ReceiveTimeout = 3000;
            client.SendTimeout = 3000;
            this.listaJson = conectarse();
        }

        public string getLista()
        {
            return this.listaJson;
        }

        public void setLista()
        {
            this.listaJson = conectarse();
        }

        private string conectarse()
        {
            string data = "";
            Console.WriteLine("Arturin0");
            try
            {
                /*
                this.socket = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
                //IPEndPoint connect = new IPEndPoint(IPAddress.Parse("192.168.0.100"), 8088);

                socket.Connect(connect);
                NetworkStream stream = new NetworkStream(socket);
                StreamReader reader = new StreamReader(stream);
                StreamWriter writer = new StreamWriter(stream) { AutoFlush = true };**/
                Console.WriteLine("Arturin1");
                
                NetworkStream stream = client.GetStream();

                Console.WriteLine("Arturin2");
                byte[] buf;
                data = "getLista";
                buf = Encoding.UTF8.GetBytes(data+"\n");
                Console.WriteLine("Arturin21");
                stream.Write(buf, 0, data.Length+1);
                Console.WriteLine("Arturin22");
                buf = new Byte[2000];
                int bytesRead = stream.Read(buf, 0, 2000);
                byte[] finalData = new byte[bytesRead];
                for (int i = 0; i < bytesRead; i++) { 
                    finalData[i] = buf[i];
                }
                string response = Encoding.UTF8.GetString(finalData);
                response = response.TrimEnd();

                data = response;
                Console.WriteLine(response);
                Console.WriteLine("Arturin3");

                /*
                     writer.WriteLine("getLista");
                     data = reader.ReadLine();*/

                //socket.Shutdown(SocketShutdown.Both);

            }
            catch (Exception e)
            {

                Console.WriteLine("No se conectó al servidor " + e.Message);

            }

            return data;

        }


        private string leerMensaje()
        {
            string mensaje = null;
            try
            {
                NetworkStream stream = new NetworkStream(socket);
                StreamReader reader = new StreamReader(stream);
                
                    mensaje = reader.ReadLine();
                

                
            }
            catch (IOException e)
            {
                Console.WriteLine("Error: " + e.Message);
            }
            return mensaje;
        }


        public void enviarAlServidor(string lista)
        {
             string data = "";
            Console.WriteLine("Arturin0");
            try
            {
                /*
                this.socket = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
                //IPEndPoint connect = new IPEndPoint(IPAddress.Parse("192.168.0.100"), 8088);

                socket.Connect(connect);
                NetworkStream stream = new NetworkStream(socket);
                StreamReader reader = new StreamReader(stream);
                StreamWriter writer = new StreamWriter(stream) { AutoFlush = true };**/
                Console.WriteLine("Arturin1");
                
                NetworkStream stream = client.GetStream();

                Console.WriteLine("Arturin2");
                byte[] buf;
                data = "actualizarLista "+lista;
                buf = Encoding.UTF8.GetBytes(data+"\n");
                Console.WriteLine("Arturin21");
                stream.Write(buf, 0, data.Length+1);
                

                /*
                     writer.WriteLine("getLista");
                     data = reader.ReadLine();*/

                //socket.Shutdown(SocketShutdown.Both);

            }
            catch (Exception e)
            {

                Console.WriteLine("No se conectó al servidor " + e.Message);

            }



        }

        public void enviarmensaje(string msg)
        {
            try
            {
                this.socket = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
                
                socket.Connect(connect);
                NetworkStream stream = new NetworkStream(socket);
                StreamWriter writer = new StreamWriter(stream) { AutoFlush = true };

                writer.WriteLine("desconectar");
              
            }
            catch (IOException e)
            {
                Console.WriteLine("Error al enviar" + e.Message);

            }


        }


        public void cerrarConexion()
        {
            try
            {
                if (client != null)
                {
                    NetworkStream stream = client.GetStream();
                    byte[] buf = Encoding.UTF8.GetBytes("desconectar\n");
                    stream.Write(buf, 0, buf.Length);
                    stream.Flush();
                    client.Close();

                    Console.WriteLine("Conexion Cerrada");
                }
            }catch(Exception e)
            {
                Console.WriteLine("Error al cerrar conexion");
            }
        }
    
}
}
