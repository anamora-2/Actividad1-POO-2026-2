/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;
import java.util.Scanner;

/**
 *
 * @author anamo
 */
public class Numero {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el numero: ");
            double numero = scanner.nextDouble();
            double cuadrado  = Operaciones.calcular_cuadrado(numero);
            double cubo = Operaciones.calcular_cubo(numero);
            
            System.out.println("Cuadrado: " + cuadrado);
            System.out.println("Cubo: " +cubo);
            System.out.println("numero: " +numero);
        }
    }
}
