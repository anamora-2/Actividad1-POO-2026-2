/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author anamo
 */
public class Circunferencia {

    public static void main(String[] args) {
        double radio = 3.0 ;
        
        double longitud_circunferencia = Operaciones.Calcular_longitud_circunferencia(radio);
        double area_circulo = Operaciones.Calcular_area_circulo(radio);
        
        System.out.println("Longitud de la Circunferencia: " +longitud_circunferencia);
        System.out.println("Area del Circulo: " +area_circulo);
    }
}
