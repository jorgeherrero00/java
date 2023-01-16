/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jmhr.ejerciciosarrays;

/**
 *
 * @author Jorge
 */
/*
Define tres arrays de 20 números cada una, con nombres "números", "cuadrado" y "cubo".
Carga el array "numero" con valores aleatorios entre 0 y 100. En el array "cuadrado" se deben almacenar
los cuadrados de los valores que hay en el array "numero". En el array "cubo" se deben almacenar los cubos de los valores
que hay en "numero". A continuacion, se mostrara el contenido en 3 columnas.
*/
public class EjerciciosArrays4 {
    public static void main(String[] args){
        
        int [] numero = new int [20];
        int [] cuadrado = new int [20];
        int [] cubo = new int [20];
        
        int i;

        for (i = 0; i < 20; i++) {
        numero[i] = (int)(Math.random()*101);
        cuadrado[i] = numero[i] * numero[i];
        cubo[i] = cuadrado[i] * numero[i];
      }
      
      System.out.println("  n  │   n²  │    n³");
      System.out.println("-----------------------");
      for (i = 0; i < numero.length; i++) {
        System.out.printf(" %3d │ %5d │%8d \n", numero[i], cuadrado[i], cubo[i]);
      }
        }
        }
        
        
        
        
    
