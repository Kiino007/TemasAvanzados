package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);

        //CREAMOS LA LISTA DE PRODUCTOS TIPO SNACK
        List<Snack> productos new ArrayList<>();
        System.out.println("*** Maquina de Snacks ***");

        //MOSTRAR EL INVENTARIO DE SNAKCS DISPONIBLES
        Snacks.mostrarSnack();

        while(!salir){
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos)
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            finally {
                System.out.println(); //IMPRIME UN SALTO DE LINEA CON CADA ITERACION
            }
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar nuevo snack
                4. Salir
                Elige una opcion:\s""");
        //LEEMOS Y RETORNAMOS LA OPCION SELECCIONADA
        return Integer.parseInt(consola.nextLine());
    }
}
