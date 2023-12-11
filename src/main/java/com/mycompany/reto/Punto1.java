/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.reto;

/**
 *
 * @author user
 */
public class Punto1 {

    public static void main(String[] args) {
        int num = 20;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            else if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println("Total=  " + sum);
    }

}
