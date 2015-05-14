
package ejercicio26;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Ejercicio 26: Introducir una frase por teclado. Imprimirla en el 
 *               centro de la pantalla.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio26 {
    
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        String frase;
        System.out.println("Introduce una frase");
        frase = escaner.nextLine();
        
        JOptionPane.showMessageDialog(null, frase);
    }
    
}
