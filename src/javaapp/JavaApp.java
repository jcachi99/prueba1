/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp;

/**
 *
 * @author Jhonatan
 */
public class JavaApp {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodoGenerado("Clase Java Fundamentals_sesion.");
        sumar(1,2,19);
    }
    
    public static void metodoGenerado(String texto){
        System.out.println(texto+" 1");
        System.out.println(texto+" 2");
    }
    
    public static void sumar(int x, int y, int z){
        int resultado = x+y+z;
        System.out.println("El resultado es: "+resultado);
    }
    
            
            
}


