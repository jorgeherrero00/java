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
10. Define un array de números enteros de 3 filas por 6 columnas con
 *     nombre "num" y asigna los valores según la siguiente tabla:
 *     num:
 *            Columna 0   Columna 1   Columna 2   Columna 3   Columna 4   Columna 5
 *     Fila 0     0          30           2                                   5
 *     Fila 1    75                                               0
 *     Fila 2                            -2           9                      11
 * 
 *    Muestra el contenido de todos los elementos del array dispuestos en
 *    forma de tabla como se muestra en la figura.
*/
public class EjerciciosArrays10 {
    public static void main(String[] args){
        int array[] [] = new int [3] [6];
        
        array[0][0] = 0;
        array[0][1] = 30;
        array[0][2] = 2;
        array[0][5] = 5;
        array[1][0] = 75;
        array[1][4] = 0;
        array[2][2] = -2;
        array[2][3] = 9;
        array[2][5] = 11;
        
        for (int x=0; x < array.length; x++) 
    {
        for (int y=0; y < array[x].length; y++) 
    {

     System.out.print(" | ");System.out.print (array[x][y]); System.out.print(" | ");

    }
    System.out.println();

       }
    }
}
