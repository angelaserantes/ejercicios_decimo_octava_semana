import java.io.*;
public class Ejercicio1 {

    public static boolean almacenarStringFichero(String cadena, String fichero) {
        boolean resultado = false;
        FileWriter escribir;
        try {
            escribir = new
                    FileWriter(fichero + ".txt");
            escribir.write(cadena);
            escribir.close();
            resultado = true;
            System.out.println("Se ha creado correctamente el fichero en la ruta " + fichero);
        } catch (IOException e) {
            System.out.println(e.toString());
            System.out.println("No se ha podido crear el fichero en la ruta " + fichero);
        }
        return resultado;
    }

}
