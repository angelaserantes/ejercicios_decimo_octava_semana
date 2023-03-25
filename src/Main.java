import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        System.out.println("Ejercicio 1: ");
        //Llamada al método del ejercicio 1 almacenarStringFichero
        Ejercicio1.almacenarStringFichero("hola mundo!", "C:\\Users\\Angela\\fichero1");

        //Ejercicio 2
        System.out.println("Ejercicio 2: ");

        //Llamada al método del ejercicio 2 "leerFichero"
        System.out.println(Ejercicio2.leerFichero("fichero2.txt"));

        //Ejercicio 3
        System.out.println("Ejercicio 3: ");
        //Llamada al método del ejercicio 3 "modificar fichero"
        System.out.println(Ejercicio3.modificarFichero("sobreescribir fichero", "fichero3.txt", true));

        //Ejercicio 4 - es la clase Perro
        System.out.println("Ejercicio 4: ");
        Perro perro1 = new Perro("beagle", 1234, "marron");
        Perro.guardarObjetoEnArchivo(perro1, "fichero4.txt", false);
        //Ejercicio5
        System.out.println("Ejercicio 5: ");
        Object lectura = Ejercicio5.lecturaFicheroObjeto("fichero4.txt");
        System.out.println(lectura.toString());
        //Ejercicio 6
        System.out.println("Ejercicio 6: ");
        Perro perro2 = new Perro("Bulldog", 1234, "gris");
        Perro perro3 = new Perro("Border-Collie", 5678, "marron");
        List<Perro> listaPerros = new ArrayList<>();
        listaPerros.add(perro2);
        listaPerros.add(perro3);
        System.out.println(Ejercicio6.guardarObjetosEnArchivo(listaPerros, "fichero6.txt", false));
        //Ejercicio7
        System.out.println("Ejercicio 7: ");
        List<?> listaObjetos = Ejercicio7.leerListaDeObjetosDesdeArchivo("fichero6.txt");
        for (Object objeto : listaObjetos) {
            System.out.println(objeto.toString());
        }
    }

}