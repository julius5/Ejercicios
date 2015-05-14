
package ejercicio36;

import java.util.Random;

/**
 * Ejercicio 36: Generar una matriz de 4 filas y 5 columnas con numeros 
 *               aleatorios entre 1 y 100, e imprimirla.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio36 {
    
        public static void main(String[] args) {
        Random rnd = new Random();
        int matriz[][] = new int[5][4];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (rnd.nextInt(100)+1);
            }
        }

        for (int x = 0; x < 5; x++) {
            System.out.print("|");
            for (int y = 0; y < 4; y++) {
                System.out.print(matriz[x][y]);
                if (y != matriz[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
    
}
