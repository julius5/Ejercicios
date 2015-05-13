package ejercicio28;

import java.util.Random;

/**
 * Ejercicio 28: Simular el lanzamiento de una moneda al aire e imprimir si ha
 *               salido cara o cruz.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio28 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int Moneda = (rnd.nextInt(2));

        if (Moneda == 0) {
            System.out.println("Cara");
        } else {
            System.out.println("Cruz");
        }
    }
    
}
