//Ejercicio 4
import java.io.*;

public class Perro implements Serializable {
    private  String raza;
    private  int chip;
    private  String color;

    public Perro(){}
    public Perro(String raza, int chip, String color){
        this.raza =  raza;
        this.chip = chip;
        this.color = color;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public int getChip(){
        return chip;
    }

    public void setChip(int chip){
        this.chip = chip;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }




    public static <T extends Serializable> void guardarObjetoEnArchivo(T objeto, String rutaArchivo, boolean guardarAlFinal) {
        FileOutputStream escrituraBytes = null;
        ObjectOutputStream escrituraObjetos = null;
        try {
            escrituraBytes = new FileOutputStream(rutaArchivo, guardarAlFinal);
            escrituraObjetos = new ObjectOutputStream(escrituraBytes);
            escrituraObjetos.writeObject(objeto);
            System.out.println("El objeto se guarda con éxito");
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("El objeto no se guarda con éxito");
        } finally {
            if(escrituraObjetos != null) {
                try {
                    escrituraObjetos.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
            if(escrituraBytes != null) {
                try {
                    escrituraBytes.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
