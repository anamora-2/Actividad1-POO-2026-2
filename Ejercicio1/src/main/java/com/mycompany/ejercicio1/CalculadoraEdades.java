/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;
import java.util.Scanner;

/**
 *
 * @author anamo
 */
public class CalculadoraEdades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la edad de Juan: ");
        int edJuan = scanner.nextInt();
        
        Persona Edad = new Persona(edJuan);
        
        System.out.println("las edades son: ");
        System.out.printf("Edad de Juan: %d\n", Edad.getEdadJuan());
        System.out.printf("Edad de Alberto: %d\n", Edad.getEdadAlber());
        System.out.printf("Edad de Ana: %d\n", Edad.getEdadAna());
        System.out.printf("Edad de la Mama: %d\n", Edad.getEdadMama());
        
    }
}
