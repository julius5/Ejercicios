
package ejercicio35;

import java.util.Scanner;

/**
 * Ejercicio 35: Usando el segundo ejemplo, hacer un programa que busque una 
 *               nota en el vector.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio35 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        String[] Materias = {"Calculo", "Fisica", "Quimica", "POO", "Redes",
            "Ingles", "Historia", "Geografia", "Biologia", "Filosofia"};
        float Calificacion[] ={9,9,8,10,8,7,9,6,8,10};
        int MateriaB;

        System.out.println("Las materias disponibles son: ");
            for (int y = 0; y < Materias.length; y++) {
                System.out.print(Materias[y]);
                System.out.print(" "+y+") |");
            }
        System.out.println("\n\nQue materia quiere Consultar ");
        MateriaB = escaner.nextInt();

        System.out.println("La calificacion para la materia "
           + "de " + Materias[MateriaB-1] + " es: " + Calificacion[MateriaB-1]);
    }
}

