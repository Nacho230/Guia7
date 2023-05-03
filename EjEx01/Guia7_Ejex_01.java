/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejex_01;

import Clases.Cancion;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia7_Ejex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cancion max1 = new Cancion("Cancion - Cruel", "Autor - Los Piojos");
        System.out.println(max1.getTitulo() + " / " + max1.getAutor());

        Cancion max2 = new Cancion();
        System.out.println("Ingrese el Titulo de la cancion Deseada, para reproducir");
        
        max2.setTitulo(leer.nextLine());
        System.out.println("Ingrese el Autor de la cancion");
        max2.setAutor(leer.nextLine());

        System.out.println("Cancion - "+max2.getTitulo() + " / " + "Autor - "+max2.getAutor());

     
    }
}
        
        
   