/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej04.Clases;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Rectangulo {
     
    //Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
     //privado base y un atributo privado altura. 
    Scanner leer = new Scanner(System.in);
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    //La clase incluirá un método para crear el rectángulo 
     //con los datos del Rectángulo dados por el usuario.
    
    
    
    public void crearRectangulo(double base, double altura){
        
        System.out.println("Ingrese la base del rectangulo"); this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo"); this.altura = leer.nextDouble();
    }
    
    //También incluirá un método 
    //para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
    //Superficie = base * altura / Perímetro = (base + altura) * 2.
    
    public void calcularSuperficie(){
       double superficie = this.base * this.altura;
        System.out.println("La superficie es : " + superficie);
        
    }
    
    
    public void calcularPerimetro(){
        double perimetro = (this.base + this.altura)*2;
        System.out.println("El perimetro es: " + perimetro);
    }
    
     //Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
    
    public void imprimirRectangulo(double base, double altura){
        
        for (int i = 0 ; i < this.altura; i++){
            
            for ( int j = 0 ; j < this.base; j++){
                
                if(i == 0 || i == this.altura-1 || j == 0 || j == this.base-1) {
                    System.out.print("n ");
                }else{
                    System.out.print("  ");
                }
                    
                    
            }
            System.out.println("");
        }
        
    }
    
}
    
    
    
    
    
    
    
    
    
    


