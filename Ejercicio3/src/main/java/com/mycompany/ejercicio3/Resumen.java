/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author anamo
 */
public class Resumen {

    public static void main(String[] args) {
        double horas_trabajadas = 48.0 ;
        double valor_hora = 5000.0 ;
        double retencion = 12.5 ;
        double porcentaje_retefuente = retencion / 100 ;
        
        double salario_bruto = Nomina.calcular_salario_bruto(horas_trabajadas, valor_hora);
        double valor_retefuente = Nomina.calcular_valor_retefuente(porcentaje_retefuente, salario_bruto);
        double salario_neto = Nomina.calcular_salario_neto(salario_bruto, valor_retefuente);
        
        System.out.println("Salario Bruto: " +salario_bruto);
        System.out.println("Retención en la Fuente:  " +valor_retefuente);
        System.out.println("Salario Neto: " +salario_neto);
        
    }
}
