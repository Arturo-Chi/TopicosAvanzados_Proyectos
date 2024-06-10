/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finaltopicos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class Cliente {
    private String listaJSON;
    
    public Cliente(){
       this.listaJSON = conectarse();
    }

    private String  conectarse() {
        String data="";        
        try{
            Socket socket = new Socket("localhost",5000);
            System.out.println("Conexion establecida");
           
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            out.writeUTF("getLista");
            out.flush();
            
            data = in.readUTF();
            
        }catch(IOException e){
            System.out.println("Conexion fallida");
        }
        return data;
    }

    public String getLista() {
        return listaJSON;
    }
    
    public void setLista(String lista){
        this.listaJSON = lista;
    }
    
    public void enviarAlServidor(String nuevalista) {
     
        try {
            Socket socket = new Socket("localhost", 5000);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
              
            
            out.writeUTF("actualizarLista"); // Puedes definir tu propio comando
            out.writeUTF(nuevalista); // Envía la lista en formato JSON
            out.flush();
            socket.close(); // Cierra el socket después de enviar los datos
            System.out.println("Lista enviada al servidor");
        } catch (IOException e) {
            System.out.println("Error al enviar la lista al servidor: " + e.getMessage());
        }
    }
}
