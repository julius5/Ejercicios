package ejercicio24;

import java.util.Scanner;

/**
 * Ejercicio 24: Comprobar si un numero mayor o igual que la unidad es primo.
 *
 * @author meny
 * @since 12/05/2015
 * @ver 1.0
 */
public class ejercicio24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, i, n;

        System.out.println("Ingrese numero");
        n = sc.nextInt();

        if (n >= 1) {
            for (i = 1; i < (n + 1); i++) {
                if (n % i == 0) {
                    a++;
                }
            }

            if (a != 2) {
                System.out.println("No es Primo");
            } else {
                System.out.println("Si es Primo");
            }
        }else{
            System.out.println("El numero no puede ser procesado");
        }
    }
}
