package mx.uach.compiladores.ejercicio03;

/**
 * Ejercicio 3: Hacer un pseudocodigo que imprima los numeros 
 *              pares entre 0 y 100.
 * 
 * @author meny
 * @since 11/05/2015
 * @version 1.0
 */
public class ejercicio3 {
    
    /**
     * Muestra todos los numeros pares desde el 0 hasta el 100.
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        
        for (int i = 0; i < 101; i=i+2) {
            System.out.println(i);
        }
    } 
    
}
