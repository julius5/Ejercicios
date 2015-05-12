
package ejercicio15;

import java.util.Scanner;

/**
 * Ejercicio 15: Introducir dos numeros por teclado. Imprimir los numeros 
 *               naturales que hay entre ambos numeros empezando por el mas pequeño, 
 *               contar cuantos hay y cuantos de ellos son pares. 
 *               Calcular la suma de los impares.
 *
 * @author meny
 * @since 12/05/2015
 * @version 1.0
 */
public class ejercicio15 {
    
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);
        int LimDer=0,LimIzq=0,Temp=0;
        int i;
        
        System.out.println("Introduce el primer numero: ");
        LimIzq = escaner.nextInt();
        System.out.println("Introduce el segundo numero: ");
        LimDer = escaner.nextInt();
        
        /**
         * Checa si el limite derecho es menor que el izquierdo en caso de que 
         * lo sea, mueve el valor del limite izquierdo al derecho y asigna el 
         * valor que tenia el limite izquiero al derecho
         */
        if(LimDer < LimIzq){
            Temp=LimIzq;
            LimIzq = LimDer;
            LimDer = Temp;
        }
        
        System.out.println("\n\n");
        for(i=LimIzq;i<(LimDer-1);i++){
            System.out.println( (LimIzq++)+1 );
        }
    }
    
}
