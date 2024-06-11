/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.servidor;

import java.io.DataInputStream;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


import java.io.FileWriter;
import java.net.InetAddress;

public class Server implements Runnable{
    private ArrayList<People> usuarios = new ArrayList<>(); //Lista de registros
    private final ArrayList<Socket> clientes;
    private final int puerto;
    private final String host;
    
    public Server(int puerto, String host) {
       this.puerto = puerto;
       this.host = host;
       
       
       clientes = new ArrayList<>();
       Thread hiloServer = new Thread(this);
       hiloServer.start();
    }
    
   
    
    

    @Override
    public void run() {
        ServerSocket servidor;
        Socket sc;
        
        
        try{
            servidor = new ServerSocket(puerto, 0, InetAddress.getByName(host));
            System.out.println("Server encendido");
            while(true){
                sc = servidor.accept();
                clientes.add(sc);
                System.out.println("Cliente conectado");
                
                DataInputStream in = new DataInputStream(sc.getInputStream());
                String solicitud = in.readUTF();
                
            }
            
        }catch(IOException ex){
            System.out.println("Servidor apagado");
            //No se debería mostrar nada
        }  
    }
    
    public static void main(String args[]){
        String HOST = "192.168.0.108";
        int puerto =5000;
        Server server = new Server(puerto, HOST);
    }
    
    
    
}
