
package ejercicio29;

import java.util.Random;

/**
 * Ejercicio 29: Simular cien tiradas de dos dados y contar las veces que entre 
 *               los dos suman 10.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio29 {
    
    public static void main(String[] args) {
        Random rnd = new Random();
        int Dado1, Dado2;
        int Contador=0;
        
        for(int i=1; i<=100; i++){
            Dado1 = (rnd.nextInt(6)+1);
            Dado2 = (rnd.nextInt(6)+1);
            
            if(Dado1+Dado2==10){
                Contador++;
            }
        }
        System.out.println("Fueron "+Contador+" Veces que los dados "
                + "sumaron 10");
    }
    
}
