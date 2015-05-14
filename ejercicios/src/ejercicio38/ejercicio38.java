package ejercicio38;

import java.util.Scanner;

/**
 * Ejercicio 38: Cargar en una matriz las notas de los alumnos de un colegio en
 * funcion del numero de cursos (filas) y del numero de alumnos por curso
 * (columnas).
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio38 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Cuantos cursos desea ingresar?");
        a = sc.nextInt();
        System.out.println("Cuantos Alumnos tiene?");
        b = sc.nextInt();

        int A[][] = new int[a][b];
        int k = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Introduce la calificacion del "
                        + "alumno " + (k + 1) + " del curzo " + (i + 1));
                A[i][j] = sc.nextInt();
                k++;
            }
            k = 0;
        }

        System.out.println("\n");
        for (int x = 0; x < a; x++) {
            System.out.print("|");
            for (int y = 0; y < b; y++) {
                System.out.print(A[x][y]);
                if (y != A[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
}
