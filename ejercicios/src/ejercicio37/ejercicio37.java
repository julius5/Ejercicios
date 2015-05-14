package ejercicio37;

import java.util.Random;

/**
 * Ejercicio 37: Generar una matriz de 4 filas y 5 columnas con n£meros
 * aleatorios entre 1 y 100, y hacer su matriz transpuesta.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio37 {

    public static void main(String args[]) {
        Random rnd = new Random();
        int A[][] = new int[5][4];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = (rnd.nextInt(100) + 1);
            }
        }

        System.out.println("La matriz dada es: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("La matriz transpuesta es: ");
        for (int j = 0; j < A[0].length; j++) {
            for (int i = 0; i < A.length; i++) {
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }
    }

}
