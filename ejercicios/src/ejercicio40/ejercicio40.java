
package ejercicio40;

/**
 * Ejercicio 40: Crear una tabla de 3 paginas, 4 filas y 5 columnas donde el 
 *               primer elemento valga 1, el segundo 2, el tercero 3 y as¡ 
 *               sucesivamente, e imprimirla.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio40 {
    
    public static void main(String[] args) {
        int[][][] arrmul= new int[3][4][5];
        int num=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    arrmul[i][j][k]=num++;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPagina "+(i+1));
            System.out.println("----------------");
            for (int j = 0; j < 4; j++) {
                System.out.println("\nFila "+(j+1));
                System.out.println("+++++++++++++++");
                for (int k = 0; k < 5; k++) {
                    System.out.println("Columna "+(k+1));
                    System.out.println("Valor "+arrmul[i][j][k]);
                }
            }
        }
    }
    
}
