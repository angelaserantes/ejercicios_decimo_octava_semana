import java.io.*;
import java.util.List;

public class Ejercicio6 {

    public static <T extends Serializable> String guardarObjetosEnArchivo(List<T> objetos, String rutaArchivo, boolean guardarAlFinal) {
        FileOutputStream escrituraBytes;
        ObjectOutputStream escrituraObjetos;
        BufferedWriter buffer;
        try {
            escrituraBytes = new FileOutputStream(rutaArchivo, guardarAlFinal);
            escrituraObjetos = new ObjectOutputStream(escrituraBytes);
            for (T objeto : objetos) {
                escrituraObjetos.writeObject(objeto);
            }
            escrituraObjetos.close();
            escrituraBytes.close();
            return "Se guardó la lista correctamente";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error al guardar";
        }
    }
}