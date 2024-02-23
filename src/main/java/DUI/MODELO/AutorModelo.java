/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DUI.MODELO;

/**
 *
 * @author pablo
 */
public class AutorModelo{
    private String autor;
    private String titulo;

    public AutorModelo() {
    }

    public AutorModelo(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
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
    
    
    
}
