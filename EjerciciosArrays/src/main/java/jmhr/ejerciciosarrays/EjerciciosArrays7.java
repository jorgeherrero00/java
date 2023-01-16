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
/**
 *
 * 7. Escribe un programa que genere 100 número aleatorios del 0 al 20 y que 
 *    los muestre por pantalla separados por espacios. El programa pedriá
 *    entonces por teclado dos valores y a continuación cambiará todas las 
 *    ocurrencias del primer valor por el segundo en la lista generada 
 *    anteriormente. Los números que se han cambiado deben aparecer 
 *    entrecomillados.
 * 
 * */
public class EjerciciosArrays7 {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        int[] numeros = new int[100];
        int i;
        int valorCambiar, valorNuevo;

        for (i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 21);
        }
        System.out.println("Los números son: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        System.out.println("Introduce el número a cambiar: ");
        valorCambiar = sc.nextInt();
        System.out.println("Introduce el valor nuevo: ");
        valorNuevo = sc.nextInt();

        for (i = 0;  i < numeros.length; i++) {
            if (numeros[i] == valorCambiar) {
            numeros[i] = valorNuevo;
            System.out.println("\""+numeros[i]+"\" ");

        }else{
                System.out.println(numeros[i]);
            }
        }


    }
}
