/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploservidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.System.Logger.Level;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Observable;
import java.util.logging.Logger;

/**
 *
 * @author artur
 */
public class Servidor  implements Runnable{
    
    private ArrayList<Socket> clientes;
    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
        this.clientes = new ArrayList<>();
    }
    
    @Override
    public void run() {
         ServerSocket servidor = null;
         Socket sc = null;
         DataInputStream in;
         
        try {
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");
            while(true){
                sc = servidor.accept();
                System.out.println("Cliente conectado");
                clientes.add(sc);

            }
        
        
        } catch (IOException e) {
           System.out.println(e.getMessage());
        }
    }
    
    
    public void enviarInfo(String [] nombre, double[] valores){
        for (Socket w : clientes) {
            try{
                DataOutputStream dos = new DataOutputStream(w.getOutputStream());
                for (int i = 0; i < 10; i++) {
                    dos.writeUTF(nombre[i]);
                    dos.writeDouble(valores[i]);
    
                }
            }catch(IOException ex){
                 System.out.println(ex.getMessage());
            }
            
        }
        
        
            
    }
}
    


