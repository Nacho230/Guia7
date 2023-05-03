/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej01.Clases_Ej01;

import static Ej01.Ej_01.leer;

/**
 *
 * @author nacho
 */
public class Libro {
    
    public String ISBN;
    public String titulo;
    public String autor;
    public int numPag;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    public void cargarLibro(){
        System.out.println("Ingrese el ISBN ");
        ISBN = leer.nextLine();
        System.out.println("Ingrese el titulo");
        titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        autor = leer.nextLine();
        System.out.println("Ingrese el numero de paginas");
        numPag = leer.nextInt();
}
    public void imprimirLibro(){
        System.out.println("El ISBN del libro es: "  + ISBN 
                + "\nEl titulo es: " + titulo
                        + " \nEl autor es: " + autor
                                + " \nY el numero de paginas es : " + numPag );
        
    }
    
    
}
