/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ej02;

import Clases_ej02.Circunferencia;

/**
 *
 * @author nacho
 */
public class Guia7_Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia circunferencia1 = new Circunferencia();
circunferencia1.crearCircunferencia();
System.out.println("Radio de la circunferencia 1: " + circunferencia1.getRadio());
System.out.println("Área de la circunferencia 1: " + circunferencia1.area());
System.out.println("Perímetro de la circunferencia 1: " + circunferencia1.perimetro());

Circunferencia circunferencia2 = new Circunferencia(5);
System.out.println("Radio de la circunferencia 2: " + circunferencia2.getRadio());
System.out.println("Área de la circunferencia 2: " + circunferencia2.area());
System.out.println("Perímetro de la circunferencia 2: " + circunferencia2.perimetro());

Circunferencia circulo1 = new Circunferencia();
circulo1.crearCircunferencia();  /// me pide ingresar el valor del Radio
System.out.println(circulo1.getRadio()); // voy a ver el valor que tiene radio
circulo1.setRadio(10); // voy a cargar el nuevo valor del Radio
System.out.println(circulo1.getRadio());
System.out.println(circulo1.perimetro());
    }

}
        
    