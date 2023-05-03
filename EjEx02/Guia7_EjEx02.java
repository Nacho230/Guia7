/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejex02;

import Puntos.Puntos;

/**
 *
 * @author nacho
 */
public class Guia7_EjEx02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
         * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
         * Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números
         * y los ingresa en los atributos del objeto. Después, a través de otro método calcular 
         * y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
         * Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
         * 
         */
        
        Puntos n1 = new Puntos();
        
        n1.crearPuntos(0, 0, 0, 0);
        n1.distancia();
        System.out.println(n1.distancia());
    }
    
}
