/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author anamo
 */
public class Calculadora {

    public static void main(String[] args) {
        
        double suma = 0 , x = 20 ; 
        suma = Operaciones.Calc_sum1(suma,x);
        double y = 40;
        x = Operaciones.Calc_x(x, y);
        suma = Operaciones.Calc_sum2(suma, x, y);
        System.out.println("la suma es: " +suma);
    }
}
