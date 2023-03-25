import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
public static boolean modificarFichero (String cadena, String ruta, boolean opcion){

    boolean resultado = false;

    try {
       File archivo = new File(ruta);
       FileWriter escribirArchivo = new FileWriter(archivo,opcion);
       BufferedWriter bufferEscribir = new BufferedWriter(escribirArchivo);
        if (opcion) {
            cadena += "\n";
        }
       bufferEscribir.write(cadena);
       bufferEscribir.close();
       escribirArchivo.close();
        resultado = true;
        if (opcion) {
            System.out.println("Se ha añadido la cadena al final del archivo en la ruta " + ruta);
        } else {
            System.out.println("Se ha sobrescrito el archivo en la ruta " + ruta);
        }
    } catch (IOException e) {
        System.out.println(e.toString());
        System.out.println("No se ha podido modificar o añadir la cadena en la ruta: " + ruta);
    }


    return resultado;

}
}


