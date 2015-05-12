
package ejercicio08;

import java.io.IOException;

/**
 * Ejercicio 8: Hacer un pseudocodigo que solo nos permita introducir S o N.
 *
 * @author meny
 * @since 11/05/2015
 * @version 1.0
 */
public class ejercicio8 {
    
    public static void main(String[] args) throws IOException
    {
        ejercicio8 ejemplo = new ejercicio8();
        ejemplo.sn();
    }
    
    /**
     * metodo que solo permite ingresar "s" para mostrar un mensaje o
     * "n" para terminar la ejecucion del programa, en cualquier otro
     * caso muestra un mensaje de error y vuelve a ejecutar el metodo
     * 
     * @throws IOException 
     */
    public void sn() throws IOException{
        char a;
        System.out.println(" introdusca:\n "
                + "S) ver mensaje\n "
                + "N) salir \n");
        a=(char)System.in.read();
        
        switch (a) {
            case 's':
                System.out.println("\n Hola Mundo");
                break;
            case 'S':
                System.out.println("\n Hola Mundo");
                break;
            case 'n':
                System.exit(0);
                break;
            case 'N':
                System.exit(0);
                break;
            default:
                System.out.println("--Opcion No Valida--\n\n");
                sn();
                break;
            }
    }
}

