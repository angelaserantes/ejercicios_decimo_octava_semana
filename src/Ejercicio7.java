import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class Ejercicio7 {
    public static <T extends Serializable> List<T> leerListaDeObjetosDesdeArchivo(String rutaArchivo) {
        List<T> listadoObjetos = new ArrayList<>();
        try (ObjectInputStream entradaObjetos = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            while (true) {
                T objeto = (T) entradaObjetos.readObject();
                listadoObjetos.add(objeto);
            }
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listadoObjetos;
    }


}
