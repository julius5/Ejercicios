
package ejercicio21;

/**
 * Ejercicio 21: Hacer un programa que calcule independientemente la suma 
 *               de los pares y los impares de los numeros entre 1 y 1000, 
 *               utilizando un switch.
 *
 * @author meny
 * @since 12/05/2015
 * @ver 1.0
 */
public class ejercicio21 {
    
    public static void main(String[] args) {
        int temporal, par=0, impar=0;
        
        for (int i = 0; i <= 1000; i++) {
            temporal=i % 2;
            switch (temporal) {
                case 0:
                    par+=i;
                    break;
                default:
                    impar+=i;
            }
        }
        System.out.println("Suma de pares "+par);
        System.out.println("Suma de impares "+impar);
    }
    
}
