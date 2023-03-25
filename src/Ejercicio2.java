import java.io.*;
public class Ejercicio2 {
    public static String leerFichero(String ruta) {
        StringBuilder contenido = new StringBuilder();
        FileInputStream lecturaFichero;
        InputStreamReader bytesATexto;
        BufferedReader buffer;
        try {
            lecturaFichero = new
                    FileInputStream(ruta);
            bytesATexto = new InputStreamReader(lecturaFichero);
            buffer = new BufferedReader(bytesATexto);
            int caracter = buffer.read();
            while (caracter != -1) {
                char texto = (char) caracter;
                contenido.append(texto);
                caracter = buffer.read();
            }
            buffer.close();
            bytesATexto.close();
            lecturaFichero.close();
            System.out.println("Se ha leído correctamente el archivo: " + ruta);
        } catch (IOException e) {
            e.printStackTrace();
            contenido = new StringBuilder("Error: " + e.getMessage());
            System.out.println("Ha ocurrido un error al leer el archivo: " + ruta);
        }
        return contenido.toString();
    }
}

