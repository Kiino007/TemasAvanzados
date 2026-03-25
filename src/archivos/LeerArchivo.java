package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        //Leer archivo
        var nombreArchivo = "mi_archivo.txt";
        //Abrimos el archivo
        var archivo = new File(nombreArchivo);
        try {
            System.out.println("Contenido del archivo:");
            //Abrir el archivo para la lectura

            //File reader solo lee caracter por caracter
            //Bufferreader para leer linea completa
            var entrada = new BufferedReader(new FileReader(archivo));
            //Leemos linea a linea el archivo

            var linea = entrada.readLine(); //Leer la primer linea del archivo

            //Leemos todas las lineas del archivo
            while(linea != null) {
                System.out.println(linea);
                //Antes de terminar el ciclo, nos movemos a la siguiente linea
                linea = entrada.readLine();
            }
            //Cerrar el archivo
            entrada.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
