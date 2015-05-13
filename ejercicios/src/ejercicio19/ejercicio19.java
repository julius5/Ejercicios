
package ejercicio19;

import java.util.Scanner;

/**
 * Ejercicio 19: Hacer un pseudocodigo que simule el funcionamiento de un reloj 
 *               digital y que permita ponerlo en hora.
 *
 * @author meny
 * @since 12/05/2015
 * @ver 1.0
 */
public class ejercicio19 {
    
    public static void main(String[] args) throws InterruptedException {
        int i = 0; // horas 
        int j = 0; // minutos 
        int bucle=1;
        Scanner escaner = new Scanner(System.in);

        System.out.println("Bienvenido al Reloj Digital Java por favor");
        System.out.println("Introduce la hora: ");
        i= escaner.nextInt();
        System.out.println("Introduce los minutos: ");
        j= escaner.nextInt();
        
        while(bucle == 1){
            for( i = i; i <= 23; i++ ) { 
                for( j = j; j <= 59; j++ ) { 
                if( i < 10 & j >= 10 ) // para que coloque el cero antes de la i 
                    System.out.println("Son las: 0" +i+ ":" +j+" Hrs"); 
                else if( i < 10 & j < 10 ) // para colocar el cero antes de la i y la j 
                    System.out.println("Son las 0" +i+ ":" + "0" +j+" Hrs"); 
                else 
                    System.out.println("Son las " +i+ ":" +j+ " Hrs"); 

                Thread.sleep(1000);
                }j=0; //vuelve los minutos a 0
            }i=0; //Vuelve las horas a 0
        }  // Cierra el bucle
    } //Cierra el main
} //Cierra el programa
