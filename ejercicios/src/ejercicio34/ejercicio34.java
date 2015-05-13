
package ejercicio34;

import java.util.Scanner;

/**
 * Ejercicio 34: Hacer un programa que lea las calificaciones de un alumno en 10
 *               asignaturas, las almacene en un vector y 
 *               calcule e imprima su media.
 *
 * @author meny
 * @since 12/05/2015
 * @ver
 */
public class ejercicio34 {
    
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        String[] Materias = {"Calculo", "Fisica", "Quimica", "POO", "Redes 1", 
          "Ingles", "Historia", "Geografia", "Biologia", "Comp Ubicua y Movil"};
        float Calificacion[] = new float[10];
        float Promedio = 0;
        int i;
        
        for(i=0; i < 10; i++){
            System.out.println("Introduce calificacion para "+Materias[i]+" :");
            Calificacion[i] = escaner.nextFloat();
            Promedio = Promedio+Calificacion[i];
        }
        Promedio = Promedio/10;
        System.out.println("El promedio es: "+Promedio);
    }
    
}
