/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finaltopicos;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;


/*
 * @author artur
 */
public class Lector {
    public static List<Persona> usuarios = new ArrayList<Persona>();
    
    
      
    public Lector(){
    }

    public static List<Persona> getLista() {
        return usuarios;
    }

    public static void setLista(List<Persona> usuarios) {
        Lector.usuarios = usuarios;
    }
     
    
    //Convierte la cadena json en lista
    public void jsonALista(String cadena){
       ObjectMapper maper = new ObjectMapper();
       try{
           usuarios = maper.readValue(cadena, new TypeReference<List<Persona>>(){});
           
       }catch(IOException ex){
           System.out.println(ex.getMessage());
  
       }
    }
    //Convierte la lista en json
    public String listaAJson(){
        String json = null;
        ObjectMapper maper = new ObjectMapper();
        try{
           json = maper.writeValueAsString(usuarios);
           
        }catch(JsonProcessingException ex){
            System.out.println(ex.getMessage());
        }
        return json;
    }
    
    
        
}
