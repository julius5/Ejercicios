
package ejercicio39;

import java.util.Scanner;

/**
 * Ejercicio 39: Ordenar una matriz de M filas y N columnas por la primera 
 *               columna utilizando el m‚todo SHELL (por insercion).
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio39 {
    
    public static void main(String[] args) {
        int fil, col;
        Scanner esc = new Scanner(System.in);
        System.out.println("Cantidad de filas");
        fil = esc.nextInt();
        System.out.println("Cantidad de Columnas");
        col = esc.nextInt();
        int[][] ord = new int[fil][col];
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Introducir numero");
                ord[i][j] = esc.nextInt();
            }
        }
        ejercicio39 prob = new ejercicio39();
        int[][] ord2 = prob.ordenarInsercion(ord);
        for (int i = 0; i < ord2.length; i++) {
            for (int j = 0; j < ord2[0].length; j++) {
                System.out.print(ord2[i][j]);
                if (j != ord2[i].length-1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

    }

    public int[][] ordenarInsercion(int[][] array) {
        int aux;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                aux = array[i][j];
                for (int a = j - 1; a >= 0 && array[i][a] > aux; a--) {
                    array[i][a + 1] = array[i][a];
                    array[i][a] = aux;
                }
            }
        }
        return array;
    }
    
}
