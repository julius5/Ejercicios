
package ejercicio14;

import java.util.Scanner;

/**
 * Ejercicio 14: Hacer un pseudocodigo que imprima el mayor y el menor de 
 * una serie de cinco numeros que vamos introduciendo por teclado.
 *
 * @author meny
 * @since 12/05/2015
 * @version 1.0
 */
public class ejercicio14 {
   
    public static void main(String[] args) {
         float[] numero = new float[5];
         float mayor=0,menor = numero[0];
         int i;
         Scanner escaner = new Scanner(System.in);
         
         for(i=0;i<5;i++){
             System.out.println("Introduce un numero: ");
             numero[i] = escaner.nextFloat();
             
             if(numero[i] > mayor){
                 mayor=numero[i];
             }else if(numero[i] < menor){
                 menor=numero[i];
             }
         }
         
         System.out.println("El numero Mayor es: "+mayor);
         System.out.println("El numero Menor es: "+menor);
         
    }
}
