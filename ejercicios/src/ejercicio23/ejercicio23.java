package ejercicio23;

import java.util.Scanner;

/**
 * Ejercicio 23: Hacer un pseudocodigo que imprima los n£meros del 0 al 100,
 * controlando las filas y las columnas.
 *
 * @author meny
 * @since 12/05/2015
 * @ver 1.0
 */
public class ejercicio23 {

    public static void main(String[] args) {
        int a, b, c = 0;
        Scanner escaner = new Scanner(System.in);
        System.out.println("El producto de filas y columnas tienen que ser 102");
        System.out.println("Introduzca filas");
        a = escaner.nextInt();
        System.out.println("Introduzca columnas");
        b = escaner.nextInt();

        if ((a * b) == 102) {
            int[][] arr = new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr[i][j] = c;
                    if (100 != c) {
                        c++;
                    } else {
                        i = a;
                        j = b;
                    }
                }
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.println("Numero " + arr[i][j] + " Fila: " 
                            + (i + 1) + " Columna: " + (j + 1));
                    if (arr[i][j] != 100) {
                        c++;
                    } else {
                        i = a;
                        j = b;
                    }
                }

            }

        } else {
            System.out.println("La cantidad introducida supera o "
                    + "es menor de 100 numeros");
        }

    }
}
