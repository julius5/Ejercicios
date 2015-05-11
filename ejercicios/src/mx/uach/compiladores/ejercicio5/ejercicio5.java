package mx.uach.compiladores.ejercicio5;

/**
 * Ejercicio 5: Hacer un pseudocódigo que imprima los numeros impares hasta el 
 *              100 y que imprima cuantos impares hay.
 * 
 * @author meny
 * @since 11/05/2015
 * @version 1.0
 */
public class ejercicio5 {
        
    public static void main(String[] args)
    {
        int a=0;
        for (int i = 1; i <= 100; i=i+2) {
            System.out.println(i);
            a++;
        }
        System.out.println("hay: "+a+" Numeros Impares");
    } 
}
