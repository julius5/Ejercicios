
package ejercicio13;

/**
 * Ejercicio 13: Imprimir y contar los numeros que son multiplos de 2 o de 3 
 *               que hay entre 1 y 100.
 *
 * @author meny
 * @since 12/05/2015
 * @version 1.0
 */
public class ejercicio13 {
    
    public static void main(String[] args) {
        int i;
        int M2=0, M3=0;
        int otro=0;
        
        for(i=1;i<=100;i++){
            if(i % 2 == 0){
                M2++;
            }else if(i % 3 == 0){
                M3++;
            }else{
                otro++;
            }
        }
        System.out.println("Fueron "+M2+" Numeros multiplos del 2");
        System.out.println("Fueron "+M3+" Numeros multiplos del 3");
        //System.out.println("Fueron "+otro+" Numeros diferentes");
    }
}
