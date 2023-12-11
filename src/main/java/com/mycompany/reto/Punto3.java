/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto;
/**
 *
 * @author user
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tamano =(int)(Math.random()*9)+8;
        
        char[] frase = new char[tamano];
        
        for (int i = 0; i< tamano; i++){
            double num = Math.random()*50;
            int valor = (int) num + 33;
            char letra = (char) valor;
            frase[i] = letra;
        }
        String contrasena = String.valueOf(frase);
        System.out.println(contrasena);
    }    
}
