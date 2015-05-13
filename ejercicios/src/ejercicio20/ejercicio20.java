
package ejercicio20;

import java.util.Scanner;

/**
 * Ejercicio 20: Calcular el factorial de un numero, mediante subprogramas.
 *
 * @author meny
 * @since 12/05/2015
 * @ver 1.0
 */
public class ejercicio20 {
    
    public static void main(String[] args) {
        int var1;
        ejercicio20 prob = new ejercicio20();
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introducir numero que quiera el factorial");
        var1= escaner.nextInt();
        System.out.println("El factorial es: "+prob.factorial(var1));
    }
    
    /**
     * Metodo que calcula el factorial
     * 
     * @param a es el numero al que le calcularemos el factorial
     * @return factorial
     */
    private double factorial(int a){
        double var1=a;
        for (int i = a; i > 2; i--) {
            var1 = var1*(i-1);
            
        }
        return var1;
    }
    
}
