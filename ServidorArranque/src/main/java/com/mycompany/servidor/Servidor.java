  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Servidor implements Runnable{
    private ArrayList<People> usuarios = new ArrayList<>(); // Lista de registros
    private final ArrayList<Socket> clientes;
    private final int puerto;
    private final String host;
    private final ServidorView vista;
    private final ExecutorService pool;

    public Servidor(int puerto, String host) {
        vista = new ServidorView();
        this.puerto = puerto;
        this.host = host;

        clientes = new ArrayList<>();
        pool = Executors.newCachedThreadPool();
        Thread hiloServer = new Thread(this);
        hiloServer.start();

        marcarLista();
        for (People p : usuarios) {
            vista.getText_Muestra().append(p.getNombre() + "\n");
        }
    }

    public void marcarLista() {
        ObjectMapper maper = new ObjectMapper();

        try {
            usuarios = maper.readValue(new File("registro.json"), new TypeReference<ArrayList<People>>() {});
            for (People p : usuarios) {
                System.out.println(p.getNombre());
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Metodo para convertir la lista al formato json
    public String listaAJSON() {
        String json = null;
        ObjectMapper maper = new ObjectMapper();
        try {
            json = maper.writeValueAsString(usuarios);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }

        return json;
    }

    public void jsonALISTA(String lista) {
        ObjectMapper maper = new ObjectMapper();

        try {
            usuarios = maper.readValue(lista, new TypeReference<ArrayList<People>>() {});
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void run() {
        ServerSocket servidor;

        try {
            servidor = new ServerSocket(puerto, 0, InetAddress.getByName(host));
            System.out.println("Servidor encendido");
            while (true) {
                Socket sc = servidor.accept();
                clientes.add(sc);
                System.out.println("Cliente conectado");
                pool.execute(new ControladorClientes(sc, this, vista));
            }

        } catch (IOException ex) {
            System.out.println("Servidor apagado: " + ex.getMessage());
        }
    }

    public static void main(String args[]) {
        String HOST = "192.168.155.191";
        int puerto = 8088;
        new Servidor(puerto, HOST);
    }

    public void saveFile(String actualizacion) {
        ObjectMapper maper = new ObjectMapper();
        String json = actualizacion;
        System.out.println(actualizacion);
        
        //Esto es nuevo
       jsonALISTA(actualizacion);
        
        
        
        try (FileWriter writer = new FileWriter("registro.json")) {
            System.out.println("Escribiendo1");
            writer.write(json);
            System.out.println("Se escribio");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    
        
}