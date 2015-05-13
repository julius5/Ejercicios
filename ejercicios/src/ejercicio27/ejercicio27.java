
package ejercicio27;

import java.util.Scanner;

/**
 * Ejercicio 27: Realizar la tabla de multiplicar de un numero entre 0 y 10.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio27 {
    
    public static void main(String[] args) {
        int X,Y=1;
        int Resultado;
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce un numero entre 0 y 10: ");
        X= escaner.nextInt();
        
        if(X<=10){
            for(int i=0; i<=10; i++){
                Resultado=X*Y;
                System.out.println(X+" x "+Y+" = "+Resultado);
                Y++;
            }
        }else{
            System.out.println("El numero introducido es mayor que 10");
        }
    }
    
}
