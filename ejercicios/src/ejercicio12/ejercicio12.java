
package ejercicio12;

import java.util.Scanner;

/**
 * Ejercicio 12: Hacer un pseudocodigo que imprima los numeros del 1 al 100. 
 *               Que calcule la suma de todos los numeros pares por un lado, 
 *               y por otro, la de todos los impares.
 *
 * @author meny
 * @since 11/05/2015
 * @version 1.0
 */
public class ejercicio12 {
    
    
    public static void main(String[] args) {
        int numero;
        int par=0, imp=0;
        Scanner escaner = new Scanner(System.in);
        int i;
        
        for(i=1;i<=100;i++){
            if(i % 2==0){
                par=par+i;
            }else{
                imp=imp+i;
            }
        }
        System.out.println("La suma de los numeros pares es: "+par);
        System.out.println("La suma de los numeros impares es: "+imp);
    }
    
}
