
package ejercicio22;

import java.util.Scanner;

/**
 * Ejercicio 22: Introducir una frase por teclado. Imprimirla cinco veces en 
 *               filas consecutivas, pero cada impresion ir desplazada cuatro 
 *               columnas hacia la derecha.
 *
 * @author meny
 * @since 12/05/2015
 * @ver 1.0
 */
public class ejercicio22 {
    
    public static void main(String[] args) {
        String[][] arr = new String[5][21];
        String fras;
        Scanner esc = new Scanner(System.in);
        System.out.println("Introduce la frase: ");
        fras = esc.nextLine();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 21; j++) {
                if (j % 5 == 0) {
                    arr[i][j] = fras;
                    i=i+1;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 21; j++) {
                System.out.println("Frase " + arr[i][j] + " fila: " + i + " columna: " + j);
            }
        }

    }
}
