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

public class Servidor implements Runnable{
    private ArrayList<People> usuarios = new ArrayList<>(); //Lista de registros
    private final ArrayList<Socket> clientes;
    private final int puerto;
    private final String host;
    ServidorView vista;
    
    public Servidor(int puerto, String host) {
        vista = new ServidorView();
       this.puerto = puerto;
       this.host = host;
       
       
       clientes = new ArrayList<>();
       Thread hiloServer = new Thread(this);
       hiloServer.start();
       
       marcarLista();
       for(People p: usuarios){
           vista.getText_Muestra().append(p.getNombre()+"\n");
       }
       
    }
    
    public void marcarLista(){
        ObjectMapper maper = new ObjectMapper();
        
        try{
            usuarios = maper.readValue(new File("registro.json"), new TypeReference<ArrayList<People>>(){});
            for(People p: usuarios){
                System.out.println(p.getNombre());
            }
            
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    //metodo para convertir la lista al formato json
    public String listaAJSON(){
        String json = null;
        ObjectMapper maper = new ObjectMapper();
        try{
            json = maper.writeValueAsString(usuarios);
        }catch(JsonProcessingException e){
            System.out.println(e.getMessage());
        }
        
        return json;
    }
    
    
    public void jsonALISTA(String lista){
        ObjectMapper maper = new ObjectMapper();
        
        try{
            usuarios = maper.readValue(lista, new TypeReference<ArrayList<People>>(){});
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void run() {
        ServerSocket servidor;
       
        
        
        try{
            servidor = new ServerSocket(puerto, 0, InetAddress.getByName(host));
            System.out.println("Servidor encendido");
            while(true){                
                Socket sc = servidor.accept();
                clientes.add(sc);
                System.out.println("Cliente conectado");
                
                
                    try/*(DataInputStream in = new DataInputStream(sc.getInputStream());
                        DataOutputStream out = new DataOutputStream(sc.getOutputStream());) */{
                        Scanner in = new Scanner(sc.getInputStream());
                        PrintWriter out = new PrintWriter(sc.getOutputStream(), true);
                       
                        while (true) {
                            if(in.hasNextLine()){
                                String solicitud = in.nextLine();
                                //System.out.println(solicitud);
                                
                                if (solicitud.equals("getLista")) {
                                   vista.getTextAcciones().append("getLista");
                                    out.println(listaAJSON());
                                    System.out.println("Lista enviada");
                                    vista.getTextAcciones().append("lista enviada");
                                } else if (solicitud.equals("actualizarLista")) {
                                    //if (in.hasNextLine()) {
                                        vista.getTextAcciones().append("actualizarLista");
                                        vista.getTextAcciones().append("recibiendoLista");
                                        String listaRecibida = in.nextLine();
                                        System.out.print(listaRecibida);
                                        jsonALISTA(listaRecibida);
                                        saveFile(listaAJSON());
                                    //}
                                } else if (solicitud.equals("desconectar")) {
                                    System.out.println("Cliente desconectado");
                                    sc.close(); // Cerrar la conexión con el cliente
                                    clientes.remove(sc); // Eliminar el cliente de la lista
                                    break;
                                }
                            }
                            
                        }
                        
                        
                    } catch (IOException ex) {
                        
                        System.out.println("Error al procesar la solicitud del cliente: " + ex.getMessage());
                    }
            }  
            

        } catch (IOException ex) {
            System.out.println("Servidor apagado: " + ex.getMessage());
        }
    }

                
                
    
    public static void main(String args[]){
        String HOST = "192.168.0.100";
        int puerto =8088;
        Servidor server = new Servidor(puerto, HOST);
    }
    
    public void saveFile(String actualizacion){
        ObjectMapper maper = new ObjectMapper();
        String json = actualizacion;
        try(FileWriter writer = new FileWriter("registro.json")){
            writer.write(json);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
    
    
        
}
/*DataInputStream in = new DataInputStream(sc.getInputStream());
                String solicitud = in.readUTF();
                if(solicitud.equals("getLista")){
                    
                    DataOutputStream out = new DataOutputStream(sc.getOutputStream());
                    out.writeUTF(listaAJSON());
                    out.flush();//Hace el envío total
                    System.out.println("Lista enviada");
                    
                    
                }else if(solicitud.equals("actualizarLista")){
                    String listarecibida = in.readUTF();
                    jsonALISTA(listarecibida);
                    saveFile(listaAJSON());
                    
                    
                }else if(solicitud.equals("desconectar")){
                    System.out.println("cliente desconectado");
                }
            }
            
        }catch(IOException ex){
            System.out.println("Servidor apagado");
            //No se debería mostrar nada
        }  
    }*/


/*
                            
                            if (solicitud.equals("getLista")) {
                                //out.writeInt(listaAJSON().length());
                                out.writeUTF(listaAJSON());
                                out.flush();
                                System.out.println("Lista enviada");
                            } else if (solicitud.equals("actualizarLista")) {
                                String listaRecibida = in.readUTF();
                                jsonALISTA(listaRecibida);
                                saveFile(listaAJSON());
                            } else if (solicitud.equals("desconectar")) {
                                System.out.println("Cliente desconectado");
                                sc.close(); // Cerrar la conexión con el cliente
                                clientes.remove(sc); // Eliminar el cliente de la lista
                                break;
                            }
                            
                            
                            */