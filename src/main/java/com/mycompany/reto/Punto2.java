/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto;

/**
 *
 * @author user
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String contrasena = "dsrg!hb4gRE";
        boolean isValidMay = false;
        boolean isValidMin = false;
        boolean isValidNum = false;
        boolean isValidCaracter = false;

        if (contrasena.length() >= 8) {
            char[] desglose = contrasena.toCharArray();
            for (char d : desglose) {
                int var1 = d;
                
                if( var1 >= 65 && var1 <=90){
                    isValidMay = true;
                }
                else if(var1 >= 97 && var1 <= 122){
                    isValidMin = true;
                }
                else if(var1 >= 48 && var1 <= 57){
                    isValidNum = true;
                }
                else if(var1 ==33 || var1 == 64 ||var1 ==35 || var1 == 36 ||var1 ==37 || var1 == 94 ||var1 ==38 || var1 == 42){
                    isValidCaracter = true;
                }
                }
            }
        
    
        if(isValidMin == true && isValidMay == true && isValidNum == true && isValidCaracter == true){
            
            System.out.println("Contrasena Correcta");
        }else{
            System.out.println("Contrasena Incorrecta, revisa si cumples con los requisitos");
                    
        }


    }

}
