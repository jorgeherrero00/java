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
Define un array de 10 símbolos con nombre "símbolo" y asigna valores a los elementos según la tabla siguiente:
*/
public class EjerciciosArrays2 {
   public static void main(String[] args){
       char [] simbolo = new char[10];
       
       simbolo[0]='a';
       simbolo[1]='x';
       simbolo[4]='@';
       simbolo[6]=' ';
       simbolo[7]='+';
       simbolo[8]='Q';
       
       for(char i:simbolo){
           System.out.println(i);
       }
   }
}
