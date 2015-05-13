
package ejercicio31;

import java.util.Scanner;

/**
 * Ejercicio 31: Introducir dos nymeros por teclado y mediante un menu, 
 *               calcule su suma, su resta, su multiplicacion o su division.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio31 {
    
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        float x,y;
        float Resultado;
        int a=0;
        
        System.out.println("Intoduce el primer numero: ");
        x= escaner.nextFloat();
        System.out.println("Introduce el segundo numero: ");
        y= escaner.nextFloat();
        
        System.out.println("\n");
        System.out.println("Que deseas hacer? \n 1) Sumar\n 2) Restar\n "
                + "3) Multiplicacion \n 4) Division");
        System.out.println("");
        a = escaner.nextInt();
        
        
        switch(a){
            case 1:
                {
                    Resultado = x+y;
                    System.out.println(x+" + "+y+" = "+Resultado);
                    break;
                }
            case 2:
                {
                    Resultado = x-y;
                    System.out.println(x+" - "+y+" = "+Resultado);
                    break;
                }
            case 3:
                {
                    Resultado = x*y;
                    System.out.println(x+" x "+y+" = "+Resultado);
                    break;
                }
            case 4:
                {
                    Resultado = x/y;
                    System.out.println(x+" / "+y+" = "+Resultado);
                    break;
                }
            default:
                System.out.println("Opcion no Valida");
                break;
        }
    }
    
}
