package ejercicio25;

import java.util.Scanner;

/**
 * Ejercicio 25: Introducir un numero menor de 5000 y pasarlo a numero romano.
 *
 * @author meny
 * @since 12/05/2015
 * @ver 1.0
 */
public class ejercicio25 {

    public static void main(String[] args) {

        int x, i;
        int MDecimal[] = {5000, 4000, 1000, 900, 500, 400,
            +100, 90, 50, 40,
            +10, 9, 5, 4, 1};
        String MRomano[] = {"V", "MV", "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"};

        Scanner in = new Scanner(System.in);

        System.out.println("\nIntroduce un numero: ");
        x = in.nextInt();

        if (x <= 5000) { //Si el numero supera los 5000 no entra aqui
            i = 0;
            System.out.println("\nEn romano es: ");
            while (x > 0) { //entra mientras sea mayor a 0
                if (x >= MDecimal[i]) { 
                /*si X es mayor que el valor de la matriz de Decimales entra */
                    System.out.print(MRomano[i]);
                    /*imprime el valor equivalente en la matriz de Romanos */
                    x = x - MDecimal[i]; /*Resta el valor de la matriz de Decimales a x*/
                } else {
                    i++; 
                }
            }
            System.out.println(" ");
        }else{
            System.out.println("El numero no puede ser procesado");
        }
    }
}
