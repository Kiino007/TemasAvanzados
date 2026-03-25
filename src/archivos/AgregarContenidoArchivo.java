package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try{
            //Revisar si existe el archivo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContenido = "\nNuevo\ncontenido";
            salida.println(nuevoContenido);
            //Guardamos la informacion en el archivo
            salida.close();
            System.out.println("Se agrego contenido al archivo...");

        }catch(Exception e){
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
