package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        try {
            //Leer todas las lineas de archivo
            //Creamos una lista con tipo cadena para leer
            //clase files read alllines para leer todas las lineas
            //paths para proporcionar la ruta donde esta el archivo y el nombre del archivo a leer
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo: ");

            //para recorrer cada una de las lineas
            for(String linea: lineas){
                System.out.println(linea);
            }

        }catch(Exception e){
            System.out.println("Error al leer archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
