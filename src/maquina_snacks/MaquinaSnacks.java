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

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos){
        var salir = false;
        switch (opcion){
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSanck(consola);
            case 4 -> {
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: " + opcion);
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos){
        System.out.print("Que snack quieres comprar (id)? ");
        vas idSnack = Integer.parseInt(consola.nextLine());

        //VALIDAR QUE EL SNACK EXISTA EN LA LISTA DE SNACKS
        var snackEncontrado = false;
        for(var snack: Snacks.getSnacks()){
            if(idSnack == snack.getIdSnak()){
                //AGREGAMOS EL SNACK A LA LISTA DE PRODUCTOS
                productos.add(snack);
                System.out.println("Ok, snack agragado: " + snack);
                snackEncontrado = true;
                break;
            }
        }
        if(!snackEncontrado){
            System.out.println("Id de snack no encontrado: " + idSnack);k
        }
    }

    private static void mostrarTicket(List<Snack> productos){
        var ticket = "*** Ticket de venta ***";
        var total = 0.0;
        for (var producto: productos){
            ticket += "\n\t- " + producto.getNombre() + " - $" + producto.getPrecio();
            total = total + producto.getPrecio();
        }
        ticket += "\n\tTotal -> $" + total;
    }

    private static void agregarSanck(Scanner consola){
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack se ha agregado correctamente");
        Snacks.mostrarSnack();
    }
}
