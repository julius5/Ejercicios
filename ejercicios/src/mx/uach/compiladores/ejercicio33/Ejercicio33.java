
package mx.uach.compiladores.ejercicio33;

import java.util.Scanner;

/**
 * Ejercicio 33: Crear un array unidimensional de 20 elementos con nombres de 
 *               personas. Visualizar los elementos de la lista debiendo ir 
 *               cada uno en una fila distinta.
 *
 * @author meny
 * @since 12/05/2015
 * @version 1.0
 */
public class Ejercicio33 {

    public static void main(String[] args) {
       
        String[] Nombre = {"Jose", "Maria", "Oswaldo", "Javier", "Manuel", "Isaac", "Pancho",
            "Miguel", "Leonardo", "Sandra", "Carolina", "Luisa", "Teresa", "Margarita",
            "Erick", "Mateo", "Marcos", "Lucas", "Juan", "Pedro"};
        for (int i = 0; i < Nombre.length; i++) {

            System.out.println(Nombre[i]);

        }
    
    }
}
