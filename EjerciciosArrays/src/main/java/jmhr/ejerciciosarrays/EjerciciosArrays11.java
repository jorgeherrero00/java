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
 * 11. Escribe un programa que pida 20 números enteros. Estos números se deben 
 *     introducir en un array de 4 filas por 5 columnas. El programa mostrará 
 *     las sumas parciales de filas y columnas igual que si de una hoja de 
 *     cálculo se tratara. 
 *     La suma total debe aparecer en la esquina inferior derecha.
*/
public class EjerciciosArrays11 {
    public static void main(String[] args){
        
        Scanner sc;
        sc = new Scanner(System.in);
        
        int [] [] array = new int [4][5];
        int i;
        int fila = 4;
        int columna = 5;
        
        System.out.println("Introduce 20 números: ");
        for ( fila = 0; fila < 4; fila++){
            for (columna = 0;  columna < 5; columna++) {
                System.out.print("Fila "+fila+", columna "+ columna+" :");
                array[fila][columna] = sc.nextInt();
            }
        }
        
        int sumaFila;
        for (fila = 0;  fila< 4; fila++) {
            sumaFila = 0;
        
        for (columna = 0;  columna< 5; columna++) {
            sumaFila += array[fila][columna];
        }
        }   
         int sumaColumna;
    int sumaTotal = 0;
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += array[fila][columna];
      }

      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
    }
    System.out.printf("|%7d   ", sumaTotal);
  
        
    }
}
