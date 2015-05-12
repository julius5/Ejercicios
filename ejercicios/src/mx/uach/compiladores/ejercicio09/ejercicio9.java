package mx.uach.compiladores.ejercicio09;

import java.util.Scanner;

/**
 * Ejercicio 9: Introducir un numero por teclado. Que nos diga si es positivo o
 * negativo.
 *
 * @author meny
 * @since 12/05/2015
 * @version 1.0
 */
public class ejercicio9 {

    Scanner escaner = new Scanner(System.in);

    public static void main(String[] args) {

        ejercicio9 eje = new ejercicio9();
        eje.numero();
    }

    /**
     * Metodo que indica si el numero ingresado es positivo o negativo
     */
    public void numero() {
        int numero=0;
        System.out.println("Introduce un numero: ");
        numero=escaner.nextInt();
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0");
        }
    }

}
