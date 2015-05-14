
package ejercicio46;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Ejercicio 46: Tenemos el fichero secuencial DATOS.DAT cuyos campos son: 
 *               DNI, NOMBRE, APELLIDOS, DIRECCION y PROVINCIA. 
 *               Listar por impresora todos los registros cuya provincia 
 *               sea una determinada que introduciremos por teclado.
 *
 * @author meny
 * @since 13/05/2015
 * @ver 1.0
 */
public class ejercicio46 {
    
    public static void main(String[] args) {
        int salir = 0, x;
        String prov;
        String[] datos = new String[5];
        String[] campos = {"DNI", "Nombre", "Apellidos", "Direccion", 
                           "Provincia"};
        Scanner escaner1= new Scanner(System.in);
        System.out.println("Provincia por default");
        prov=escaner1.nextLine();
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("DATOS2.dat");
            pw = new PrintWriter(fichero);

            do{
                Scanner escaner = new Scanner(System.in);
                for (int i = 0; i < 4; i++) {
                    System.out.println("Introduce " + campos[i] + " :");
                    datos[i] = escaner.nextLine();
                    datos[4] = prov;
                }
                
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
                
            }while (salir != 1);

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
