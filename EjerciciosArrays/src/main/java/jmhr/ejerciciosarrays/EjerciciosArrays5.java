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
Escribe un programa que pida 10 números enteros y muestre la posición y el valor del mayor y el menor de todos ellos
*/
public class EjerciciosArrays5 {
    public static void main(String[] args){
        Scanner sc;
        sc = new Scanner(System.in);
        
        //Declaración de variables
        int[] numero = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int posMin = -1;
        int posMax = -1;
        
        
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Introduzca 10 números: ");
            numero[i]= sc.nextInt();
            
            if (numero[i]< minimo) {
                minimo = numero[i];
                posMin=i;
            }
            if (numero[i]> maximo) {
                maximo = numero[i];
                posMax = i;
            }
        }
        System.out.print("El máximo introducido ha sido: "+maximo+" en la posicion: "+posMax);
        System.out.print("El mínimo introducido ha sido: "+minimo+" en la posicion: "+posMin);
    }
}
