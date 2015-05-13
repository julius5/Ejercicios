
package ejercicio30;

import java.util.Random;

/**
 * Ejercicio 30: Simular una carrera de dos caballos si cada uno tiene igual 
 *               probabilidad de ganar.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio30 {
    
    public static void main(String[] args) {
        Random rnd = new Random();
        int Moneda = (rnd.nextInt(2)+1);

        if (Moneda == 1) {
            System.out.println("Gano Caballo 1");
        } else {
            System.out.println("Gano Caballo 2");
        }
    }
    
}
