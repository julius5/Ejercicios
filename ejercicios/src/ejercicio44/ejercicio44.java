package ejercicio44;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Ejercicio 44: Hacer un programa que nos permita dar bajas en el fichero
 * DATOS.DAT.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio44 {

    public static void main(String[] arg) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("Datos.dat");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}
