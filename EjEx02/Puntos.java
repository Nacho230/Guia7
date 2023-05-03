/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puntos;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Puntos {
    //Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
    //sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
    
   private double X1;
   private double X2;
   private double Y1;
   private double Y2;        

    public Puntos() {
    }

    public Puntos(double X1, double X2, double Y1, double Y2) {
        this.X1 = X1;
        this.X2 = X2;
        this.Y1 = Y1;
        this.Y2 = Y2;
    }

    public double getX1() {
        return X1;
    }

    public double getX2() {
        return X2;
    }

    public double getY1() {
        return Y1;
    }

    public double getY2() {
        return Y2;
    }

    public void setX1(double X1) {
        this.X1 = X1;
    }

    public void setX2(double X2) {
        this.X2 = X2;
    }

    public void setY1(double Y1) {
        this.Y1 = Y1;
    }

    public void setY2(double Y2) {
        this.Y2 = Y2;
    }

    
   //Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números
    //y los ingresa en los atributos del objeto.
   
    public void  crearPuntos(double X1, double X2, double Y1, double Y2){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la posicion X1");
        this.X1 = leer.nextDouble();
         System.out.println("Ingrese la posicion X2");
        this.X2 = leer.nextDouble();
         System.out.println("Ingrese la posicion Y1");
        this.Y1 = leer.nextDouble();
         System.out.println("Ingrese la posicion Y2");
        this.Y2 = leer.nextDouble();
    }
    
    //Después, a través de otro método calcular 
         //y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
    
    public double distancia(){
        return Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2-Y1, 2));
        
    }
    
}
