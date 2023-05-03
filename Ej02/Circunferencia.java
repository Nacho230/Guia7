/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_ej02;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
    /// clase llamada Circunferencia que tenga como atributo
// privado el radio de tipo real
public class Circunferencia {
      private double radio;
      
      // Constructor que inicializa el radio pasado como parámetro
    public Circunferencia(double radio) {
        this.radio = radio;
    }

   // Constructor del Radio vacio
   public Circunferencia(){
        
    }
    
 // Métodos get y set para el atributo radio de la clase Circunferencia
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para crear una circunferencia pidiendo el RADIO al usuario
    public void crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextDouble();
        this.setRadio(radio);
    
}
    // Método area(): para calcular el área de la circunferencia (Area=〖
    // π*radio〗^2).
    
    public double area() {
           //return ((3.14*radio)*(3.14*radio));
            return Math.PI * Math.pow(radio, 2);
            
}
  //  Método perimetro(): para calcular el perímetro
//    (Perimetro=2*π*radio).
     public double perimetro() {
         return (2*(Math.PI * radio));
     }
    
}

