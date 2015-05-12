
package ejercicio16;

/**
 * Ejercicio 16: Imprimir diez veces la serie de numeros del 1 al 10.
 *
 * @author meny
 * @since 12/05/2015
 * @version 1.0
 */
public class ejercicio16 {
    
    public static void main(String[] args) {
        
        int i,j;
        
        for(i=1;i<=10;i++){
            System.out.println("Serie numero: "+i);
            for(j=1;j<=10;j++){
                System.out.println(j);
            }
            System.out.println("\n");
        }
    }
    
}
