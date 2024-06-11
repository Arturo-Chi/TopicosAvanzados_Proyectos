import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread{
    private int puerto;
    private boolean stop = false;

    public Servidor(int puerto){
        this.puerto = puerto;


    }

    public int getPuerto() {
        return puerto;
    }
    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public void detenerServidor(){
        this.stop = true;
    }

    @Override
    public void run() {
        ServerSocket servidor = null;
        try{
            System.out.println("Esperando conexión");
            servidor = new ServerSocket(this.puerto);

            while(!stop){
                Socket nuevoCliente = servidor.accept();
                HiloCliente nuevoT = new HiloCliente(nuevoCliente);
                nuevoT.start();
            }
            servidor.close();
            System.out.println("Conexión terminada");
        }catch(IOException e){
            System.out.println("No se estableció conexión");
           e.printStackTrace(); 
        }finally{
            if(servidor!= null){
                try{
                    servidor.close();
                }catch(IOException e1){
                    e1.printStackTrace();
                }
            }
        }
    }
    
}
