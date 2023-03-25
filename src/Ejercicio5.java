import java.io.*;
public class Ejercicio5 {
    public static <T extends Serializable> T lecturaFicheroObjeto(String ruta) {
        FileInputStream lecturaBytes;
        ObjectInputStream lecturaObjetos;
        T objeto = null;
        try {
            lecturaBytes = new FileInputStream(ruta);
            lecturaObjetos = new ObjectInputStream(lecturaBytes);
            objeto = (T) lecturaObjetos.readObject();
            lecturaObjetos.close();
            lecturaBytes.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objeto;
    }
}