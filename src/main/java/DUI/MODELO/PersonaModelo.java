/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DUI.MODELO;

import java.util.Date;

/**
 *
 * @author pablo
 */
public class PersonaModelo {
    private String autor;
    private String titulo;
     private String ISBN;
    private int páginas;
    private String edición;
    private String editorial;
    private String lugar; 
    private String fecha;

    public PersonaModelo() {
    }

    public PersonaModelo(String autor, String titulo, String ISBN, int páginas, String edición, String editorial, String lugar, String fecha) {
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.páginas = páginas;
        this.edición = edición;
        this.editorial = editorial;
        this.lugar = lugar;
        this.fecha = fecha;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPáginas() {
        return páginas;
    }

    public void setPáginas(int páginas) {
        this.páginas = páginas;
    }

    public String getEdición() {
        return edición;
    }

    public void setEdición(String edición) {
        this.edición = edición;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
