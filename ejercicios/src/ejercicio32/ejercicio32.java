package ejercicio32;

import java.util.Scanner;

/**
 * Ejercicio 32: Hacer un programa que nos permita introducir un numero por
 * teclado y sobre el se realicen las siguientes operaciones: comprobar si es
 * primo, hallar su factorial o imprimir su tabla de multiplicar.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio32 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        ejercicio32 eje32 = new ejercicio32();

        //--- Variables
        int a = 0;
        int x;
        double factorial = 1;

        System.out.println("Introduce un numero:");
        a = escaner.nextInt();
        System.out.println("\n");
    }
/*
    //--- Numero Primo
    public void primo() {
        for (int i = 1; i < (x + 1); i++) {
            if (x % i == 0) {
                a++;
            }
        }
        if (a != 2) {
            System.out.println("No es Primo");
        } else {
            System.out.println("Si es Primo");
        }
    }

    //--- Factorial
    public void factorial() {
        for (int i = x;
                i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + x + " es " + factorial);
    }*/
}
