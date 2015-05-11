package mx.uach.compiladores.ejercicio5;

import java.util.Scanner;

/**
 * Ejercicio 6: Hacer un pseudocodigo que imprima todos los numeros naturales 
 *              que hay desde la unidad hasta un numero que introducimos por 
 *              teclado.
 * 
 * @author meny
 * @since 11/05/2015
 * @version 1.0
 */
public class ejercicio6 {
        
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int num; 
        System.out.println("Ingrese un numero:"); 
        num = entrada.nextInt(); 
        
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    } 
}
