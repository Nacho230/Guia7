/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej01;

import Ej01.Clases_Ej01.Libro;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Ej_01 {

    /**
     */
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear una clase llamada Libro que contenga los siguientes atributos: 
        //ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados 
        //por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos 
        //al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.

        Libro n1 = new Libro();
        n1.cargarLibro();
        n1.imprimirLibro();
    }
    
}
