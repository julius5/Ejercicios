package ejercicio07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Ejercicio 7: Introducir tantas frases como queramos y contarlas.
 *
 * @author meny
 * @since 11/05/2015
 * @version 1.0
 */
public class ejercicio7 {

    public static void main(String[] args) throws IOException {
        ejercicio7 eje = new ejercicio7();
        eje.problema();
    }
    
    /**
     * Metodo que regresa el numero de frases ingresadas mediante un ciclo
     * for
     * 
     * @return Numero de frases ingresadas
     */
    public void problema(){
        Scanner escaner = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese las frases que desea "
                + "que el programa cuente (escriba * para terminar) : ");
        for(String frase;(frase = escaner.nextLine())!= null;contador++){
            if(frase.equals("*")){
                    System.out.println("\n\n->El numero de frases "
                            + "ingresadas es : " +contador);
                    break;
            }
        }
    
    }
}
