/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lecturajson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author artur
 */
public class LecturaJSON {
    public static List<Libro> libros = new ArrayList<Libro>();
    public static void fillPeople(){
        Libro a = new Libro("Gato", "jh", 1945, "15");
        Libro b = new Libro("Perro", "jk", 1955, "15");
        Libro c = new Libro("Loro", "jj", 1965, "15");
        Libro d = new Libro("Conejo", "jg", 1975, "15");
        Libro e = new Libro("ddfvdsv", "Canche", 23, "wawaw");

        libros.add(a);
        libros.add(b);
        libros.add(c);
        libros.add(d);
        libros.add(e);
    
    }

    
    
    public static void main(String[] args) {
        fillPeople();
        ObjectMapper mapper = new ObjectMapper();
        /*try{
            String json = mapper.writeValueAsString(libros);
            System.out.println(json);
            String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(libros);
            System.out.println("--------------------");
            System.out.println(prettyJson);

          

        }catch(JsonProcessingException ex){
            System.out.println(ex.toString());
            return;
        }*/
        saveFile();
        System.out.println(leerDatos("Gato"));
    }

    public static void saveFile(){
        ObjectMapper mapper = new ObjectMapper();
        String json;
        try{
            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(libros);

        }catch(JsonProcessingException ex){
            System.out.println(ex.toString()+ "Ha ocurrido un error");
            return;
        }

        try(FileWriter escritor = new FileWriter("mijson.json")){
            escritor.write(json);
            System.out.println("Objeto guardado");
        }catch(IOException ex){
            System.out.println("No se encontró el archivo");
        }
    }


    public static String leerDatos(String nombre){
        String retorno="";
        ObjectMapper mapper = new ObjectMapper();
        try{
            List<Libro> libros = mapper.readValue(new File("mijson.json"), new TypeReference<List<Libro>>() {});
            for(Libro aux: libros){
                if(aux.getTitulo().equals(nombre)){
                    retorno = aux.toString();
                }else{
                    break;
                }
            }
        
        }catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println("xxxx");
        }

        return retorno;

        
    }

    public static String readAllLines(String ruta){
        String content ="";
        try{
            content = new String(Files.readAllBytes(Paths.get(ruta)));
        } catch(Exception ex){
            System.out.println(ex.toString());
            System.exit(1);

        }
        return content;
    }
   

    
}
