/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class ControladorClientes implements Runnable{
    private final Socket socket;
    private final Servidor servidor;
    private final ServidorView vista;

    public ControladorClientes(Socket socket, Servidor servidor, ServidorView vista) {
        this.socket = socket;
        this.servidor = servidor;
        this.vista = vista;
    }

    @Override
    public void run() {
        try (Scanner in = new Scanner(socket.getInputStream());
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            while (true) {
                if (in.hasNextLine()) {
                    String solicitud = in.nextLine();
                    vista.getTextAcciones().append(solicitud);
                    System.out.println(solicitud);

                    if (solicitud.equals("getLista")) {
                        vista.getTextAcciones().append("getLista\n");
                        out.println(servidor.listaAJSON());
                        System.out.println("Lista enviada");
                        vista.getTextAcciones().append("lista enviada\n");
                        vista.getTextAcciones().append(servidor.listaAJSON()+"\n");
                    } else if (solicitud.startsWith("actualizarLista")) {
                        System.out.println("act1");
                        System.out.println(solicitud);
                        System.out.println("act2");
                        String listaRecibida = solicitud.replace("actualizarLista ", "");
                        System.out.println("act3");
                        System.out.println(listaRecibida);
                        servidor.saveFile(listaRecibida);
                    } else if (solicitud.equals("desconectar")) {
                        vista.getTextAcciones().append("desconectar\n");
                        System.out.println("Cliente desconectado");
                        socket.close();
                        break;
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println("Error al procesar la solicitud del cliente: " + ex.getMessage());
        }
    }

}
