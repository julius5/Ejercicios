package mx.uach.compiladores.ejercicio4;

/**
 * Ejercicio 4: Hacer un programa que imprima la suma de los 
 *              100 primeros numeros.
 * 
 * @author meny
 * @since 11/05/2015
 * @version 1.0
 */
public class ejercicio4 {
        
    /**
     * muestra la suma de los primeros 100 numeros del 1 al 100.
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        int a=0;
        for (int i = 0; i <= 100; i++) {
            a=a+i;
        }
        System.out.println("la suma de los primeros 100 numeros es: "+a);
    } 
    
}
