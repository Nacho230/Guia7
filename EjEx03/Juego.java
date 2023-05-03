/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejex_03.Juego;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Juego {
    private int numeroX;
    private int intentosMax=3;
    private int cont=0;

    public Juego() {
    }
    
    public Juego (int numeroX, int intentosMax){
        this.numeroX=numeroX;
        this.intentosMax=intentosMax;
        
    }
    
 

    public int getNumeroX() {
        return numeroX;
    }

    public void setNumeroX(int numeroX) {
        this.numeroX = numeroX;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    public void NumeroSecreto(Juego entidad){
   this.numeroX = (int)(Math.random()*10+1);
   
        
    }
    public void iniciarJuego(Juego entidad){
        entidad.NumeroSecreto(entidad);
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Adivina el numero Secreto");
        do{
            int num = leer.nextInt();
            if(num != entidad.getNumeroX() ){
                entidad.setCont(cont+=1);
               
                
                
            } else{
                System.out.println("adivinaste gil");
            }
            
        }while (entidad.getCont()<entidad.getIntentosMax() );
        System.out.println("Se acabo el Juego.");
    }
}
    
  