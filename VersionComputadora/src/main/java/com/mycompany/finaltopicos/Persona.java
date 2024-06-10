/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finaltopicos;
/**
 *
 * @author artur
 */
public class Persona {
    
    
    private String nombre;
    private String[][] avances = new String[10][10];
    
    public Persona(String nombre){
        this.nombre = nombre;
        
    }
    
    public Persona(){
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String[][] getAvances(){
        return avances;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAvances(String[][] avances) {
        this.avances = avances;
    }
    
    
    
    

}
