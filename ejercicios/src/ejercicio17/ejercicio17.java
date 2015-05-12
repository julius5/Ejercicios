
package ejercicio17;

import java.util.Scanner;

/**
 * Ejercicio 17: Imprimir, contar y sumar los multiplos de 2 que hay entre una 
 *               serie de numeros, tal que el segundo sea mayor o igual que el 
 *               primero.
 *
 * @author meny
 * @since 12/05/2015
 * @version 1.0
 */
public class ejercicio17 {
    
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);
        int i=0,j=0;
        int Contador=0;
        int Suma=0;
        int Salir=0;
        
        while(j >= i){
            System.out.println("->Introduce el primer numero: ");
            i = escaner.nextInt();
            System.out.println("->Íntroduce el segundo numero: ");
            j = escaner.nextInt();
            
            System.out.println("\n");
            if(i %2==0){
                System.out.println("El numero: "+i+" es multiplo de 2");
                Contador++;
                Suma=Suma+i;
            }
            if(j %2==0){
                System.out.println("El numero: "+j+" es multiplo de 2");
                Contador++;
                Suma=Suma+j;
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("Fueron ("+Contador+") Numeros multiplos del (2)");
        System.out.println("La suma Total de estos numeros fue: "+Suma);
    }
    
}
