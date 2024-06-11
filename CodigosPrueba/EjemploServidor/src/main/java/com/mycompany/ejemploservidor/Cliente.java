/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploservidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author artur
 */
public class Cliente extends Observable implements Runnable{
    private int puerto;

    public Cliente(int puerto) {
        this.puerto = puerto;
    }
    
    @Override
    public void run() {
       final String HOST = "127.0.0.1";
       DataOutputStream out;
       DataInputStream dis;
       
       try{
           Socket sc = new Socket(HOST, puerto);
           dis = new DataInputStream(sc.getInputStream());
           String nombre;
           double valor;
           
           while(true){
               nombre = dis.readUTF();
               this.setChanged();
               this.notifyObservers(nombre);
               this.clearChanged();
               
               
               valor = dis.readDouble();
               this.setChanged();
               this.notifyObservers(nombre);
               this.clearChanged();
           }
       }catch(IOException ex){
           System.out.println(ex.getMessage());
       }
       
       
    }

    
    
}
