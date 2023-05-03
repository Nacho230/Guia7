/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Ej03;

import java.util.Scanner;



/**
 *
 * @author nacho
 */
public class Operacion {
    //Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2.
     Scanner leer = new Scanner(System.in);
    private int numero1;
    private int numero2;
    
    //Método constructor con todos los atributos pasados por parámetro.

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //Método constructor sin los atributos pasados por parámetro.

    public Operacion() {
    }
    
    //Métodos get y set.

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    
    public void crearOperacion(){
        System.out.println("Ingrese los dos numeros: ");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        this.setNumero1(numero1);
        this.setNumero2(numero2);
    }
    
    //Método sumar(): calcular la suma de los números y devolver el resultado al main.
    
    public int sumar(){
        return (numero1+numero2);
    }
    
    
    //Método restar(): calcular la resta de los números y devolver el resultado al main
    
    public int restar(){
        return (numero1-numero2);
    }
    
   // Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
//el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
    
    public int multiplicar(){
        if(numero1 == 0 || numero2 == 0){
            System.out.println("Che boludazo no podes ingresar un CERO");
            return 0;
        }else{
            return (numero1*numero2);
        }
    }
    
    //Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
//el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    
   public int dividir(){
        if(numero1 == 0 || numero2 == 0){
            System.out.println("Che boludazo no podes ingresar un CERO");
            return 0;
        }else{
            return (numero1/ numero2);
        }
    }
    
}
