/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejex_02;

import Cuenta.Cuenta;

/**
 *
 * @author nacho
 */
public class Guia7_EjEx_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta max1 = new Cuenta();
        max1.crearCuenta();
        max1.retirarDinero(max1);
    }
}