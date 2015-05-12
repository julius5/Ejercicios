
package ejercicio10;

import java.util.Scanner;

/**
 * Ejercicio 10: Introducir un numero por teclado. 
 *               Que nos diga si es par o impar.
 *
 * @author meny
 * @since 12/05/2015
 * @version 1.0
 */
public class ejercicio10 {
    
    public static void main(String[] args) {
        ejercicio10 eje10= new ejercicio10();
        eje10.num();
    }
    
    public void num(){
        float numero;
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        numero =escaner.nextFloat();
        if(numero %2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
