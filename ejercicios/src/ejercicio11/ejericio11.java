
package ejercicio11;

import java.util.Scanner;

/**
 * Ejercicio 11: Imprimir y contar los multiplos de 3 desde la unidad hasta un 
 *               numero que introducimos por teclado.
 *
 * @author meny
 * @since 12/05/2015
 * @version 1.0
 */
public class ejericio11 {
    
    /**
     * imprime los numeros multiplos de 3 desde la unidad hasta el numero
     * que introducimos por teclado
     * 
     * @param args 
     */
    public static void main(String[] args) {
        int numero;
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        numero=escaner.nextInt();
        int i, contador=0;
        
        for(i=0;i<=numero;i++){
            if(i %3 == 0){
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Fueron; "+contador+" Numeros");
    }
    
}
