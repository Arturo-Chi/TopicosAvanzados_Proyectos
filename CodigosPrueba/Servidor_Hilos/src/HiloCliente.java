import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class HiloCliente extends Thread{
    private Socket cliente = null;
    private DataOutputStream dos = null;
    private  DataInputStream dis = null;
    private boolean parar = false;
    private static final int BUFFER_SIZE = 8192;

    public HiloCliente(Socket cliente){
        this.cliente = cliente;
    }

    public void run(){
        try{
            dos = new DataOutputStream(this.cliente.getOutputStream());
            dis = new DataInputStream(this.cliente.getInputStream());

            byte[] data = new byte[BUFFER_SIZE];
            while(!parar){
                String fichero = dis.readUTF();
                System.out.println("El cliente: "+this.cliente.getLocalAddress());

                File ficheroserver = new File("C:\\Users\\artur\\Desktop\\Servidor\\" + fichero);

                if(ficheroserver.exists()){
                    long tamanioFile = ficheroserver.length();
                    int bytesLeidos=0;

                    dos.writeLong(tamanioFile);
                    DataInputStream disFichero = new DataInputStream(new FileInputStream(ficheroserver));
                    while(bytesLeidos == disFichero.read(data, 0, BUFFER_SIZE)){
                        dos.write(data, 0, bytesLeidos);

                    }
                    System.out.println("Se envio el fichero");
                   disFichero.close();

                }else{
                    dos.writeLong(-1);
                }
            }
        }catch(IOException e){
            System.out.println("Conexion con cliente: "+this.cliente.getRemoteSocketAddress() + "Cerrada");

        }finally{
            parar();
        }
        System.out.println("Hilo finalizado");
    }


    public void parar(){
        parar = true;
        try{

            if(dos != null){
                dos.close();
            }

            if(dis != null){
                dis.close();
            }

            if(cliente != null){
                cliente.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

