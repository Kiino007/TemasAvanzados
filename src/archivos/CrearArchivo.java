package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        try {
            var nombreArchivo = "mi_archivo.txt";
            var archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                System.out.println("El archivo existe");
            } else {
                //creamos el archivo
                //PrintWriter es para poder gestionar o hacer acciones con el archivo
                //FileWriter es para crear el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); //para que se pueda guardar la informacion en el disco duro
                System.out.println("El archivo se ha creado");
            }
        }catch(IOException e) {
            System.out.println("Error al crear el archivo");
            e.printStackTrace();//para que muestre la trazabilidad del error
        }
    }
}
