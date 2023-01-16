/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jmhr.ejerciciosarrays;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
/*
Escribe un programa que lea 10 números por teclado y que luego 
los muestre en orden inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
*/
public class EjerciciosArrays3 {
    public static void main(String[] args){
        Scanner sc;
        sc = new Scanner(System.in);
        
        int [] n= new int [10];
        
        System.out.println("Introduzca un número");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        
        
        for (int i = n.length-1; i >=0; i--) {
            System.out.println(n[i]);
        }
        
        
    }
}
