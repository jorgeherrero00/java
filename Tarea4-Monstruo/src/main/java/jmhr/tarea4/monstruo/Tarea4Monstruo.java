package jmhr.tarea4.monstruo;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author Jorge
 */
public class Tarea4Monstruo {

    public static void main(String[] args) {
        
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        int nUsuario;
        Monstruo [] array= new Monstruo[10];
        String nombre,color;
        int posicionX,posicionY;
        boolean vivo;
        
        
        
        
        System.out.println("Configuración de Monstruos.");
        System.out.println("================================");
        System.out.println("1.- Crear un nuevo monstruo sin datos");
        System.out.println("2.- Crear un nuevo monstruo con datos conocidos.");
        System.out.println("3.- Asignar nombre a un monstruo.");
        System.out.println("4.- Asignar posicion X a un monstruo.");
        System.out.println("5.- Asignar posicion Y a un monstruo.");
        System.out.println("6.- Asignar color a un monstruo.");
        System.out.println("7.- Matar un monstruo");
        System.out.println("8.- Mostrar por pantalla los datos de un monstruo.");
        System.out.println("0.- Salir de la aplicacion.");
        System.out.println("=======================");
        System.out.println("Introduzca la opción elegida: ");
        nUsuario = sc.nextInt();
        
        while(nUsuario<0 || nUsuario>9){
            System.out.println("Configuración de Monstruos.");
            System.out.println("================================");
            System.out.println("1.- Crear un nuevo monstruo sin datos");
            System.out.println("2.- Crear un nuevo monstruo con datos conocidos.");
            System.out.println("3.- Asignar nombre a un monstruo.");
            System.out.println("4.- Asignar posicion X a un monstruo.");
            System.out.println("5.- Asignar posicion Y a un monstruo.");
            System.out.println("6.- Asignar color a un monstruo.");
            System.out.println("7.- Matar un monstruo");
            System.out.println("8.- Mostrar por pantalla los datos de un monstruo.");
            System.out.println("0.- Salir de la aplicacion.");
            System.out.println("=======================");
            System.out.println("Introduzca la opción elegida: ");
            nUsuario = sc.nextInt();
        }
        
                  
        switch(nUsuario){
            case 1:
                for (int i = 0; i < 2; i++) {
                    array[i] = new Monstruo();
                    System.out.println(array[i]);
                }
            case 2:
                for (int i = 0; i < 2; i++) {
                    System.out.println("Introduzca el nombre del monstruo: ");
                    nombre = sc.nextLine();
                    System.out.println("Introduzca la posicionX: ");
                    posicionX = sc.nextInt();
                    System.out.println("Introduzca la posicionY: ");
                    posicionY = sc.nextInt();
                    System.out.println("Introduzca el color: ");
                    color= sc.nextLine();
                    array[i] = new Monstruo(nombre,posicionX,posicionY,color);
                    System.out.println(array[i]);
                }
        }
        

        
}
}
