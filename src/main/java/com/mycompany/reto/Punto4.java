/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto;

/**
 *
 * @author user
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a =0 ,b=1;
        for (int i=0; i<10; i++){
            System.out.print(a + " ");
            a =b;
            b=a+b;
            
        }
        System.out.println("");
    }
    
}
