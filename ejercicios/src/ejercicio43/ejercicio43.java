package ejercicio43;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Ejercicio 43: Hacer un programa que nos permita dar altas en el fichero
 *               secuencial DATOS.DAT, cuyos campos son: DNI, NOMBRE, 
 *               APELLIDOS, DIRECCION y PROVINCIA.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio43 {

    public static void main(String[] args) {
        int salir = 0, x;
        //Scanner escaner = new Scanner(System.in);
        String[] datos = new String[5];
        String[] campos = {"DNI", "Nombre", "Apellidos", "Direccion", "Provincia"};

        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try {
            fichero = new FileWriter("DATOS.dat");
            pw = new PrintWriter(fichero);

            while (salir != 1) {
                Scanner escaner = new Scanner(System.in);
                int i=0;
                for (i = 0; i < 5; i++) {
                    System.out.println("Introduce " + campos[i] + " :");
                    datos[i] = escaner.nextLine();
                }
                //---Imprimimos en el archivo
                for (int y = 0; y < 5; y++) {
                    pw.print(datos[y]);
                    pw.print(" ");
                }
                pw.println("");
                
                System.out.println("Deseas ingresar otro Dato?\n1) Si \n2) No");
                x=escaner.nextInt();
                    if(x==2){
                        salir=1;
                    }
                //Con esto imprimes en el archivo
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
