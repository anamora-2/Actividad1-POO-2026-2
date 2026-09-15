/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author anamo
 */
public class Persona {
    private final int edJuan;
    private int edAlber;
    private int edAna;
    private int edMama;
    
    public Persona(int edJuan){
        this.edJuan = edJuan;
        calcularEdades();
    }
    
    private void calcularEdades(){
        this.edAlber = (this.edJuan * 2)/3 ;
        this.edAna = (this.edJuan * 4)/3;
        this.edMama = this.edJuan + this.edAlber + this.edAna;
    }
    
    public int getEdadJuan(){return edJuan; }
    public int getEdadAlber(){return edAlber; }
    public int getEdadAna(){return edAna; }
    public int getEdadMama(){return edMama; } 
    
}
