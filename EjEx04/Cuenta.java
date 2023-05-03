/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Cuenta {
    private String titular;
    private float saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

 
    public String toString() {
        return "entidad:{" +
                "Titular='" + titular + '\'' +
                ", Saldo=" + saldo +
                '}';
    }
   
    public void crearCuenta() {
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Titular:");
        this.setTitular(leer.nextLine());
        System.out.println("Saldo:");
        this.setSaldo(leer.nextFloat());
       
    }

    public void retirarDinero(Cuenta entidad) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto desea retirar?");
        float retiro = leer.nextFloat();
        if (entidad.getSaldo() < retiro) {
            System.out.println("No es posible retirar esa cantidad!");
        } else {
            entidad.setSaldo(saldo - retiro);
            System.out.println("Gracias");
        }
    }
}

