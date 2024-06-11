/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lecturajson;

/**
 *
 * @author artur
 */
public class Libro {
    private String titulo;
    private String isbn;
    private int year;
    private String paginas;

    public String getIsbn() {
        return isbn;
    }
    public String getPaginas() {
        return paginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getYear() {
        return year;
    }
    

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public Libro(String nombre, String isbn, int year, String paginas){
        this.setTitulo(nombre);
        this.setIsbn(isbn);
        this.setYear(year);
        this.setPaginas(paginas);
    }

    
    public Libro(){
        this.setTitulo("");
        this.setIsbn("");
        this.setYear(0);
        this.setPaginas("");
    }


    @Override
    public String toString() {
        return getTitulo()+"\n"+getYear()+"\n"+getIsbn();

    }
    
    


}    
