package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    //BLOQUE STATIC INICIALIZADOR
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("gaseosa", 120));
    }

    //SE AGREGA EL METODO DE AGREGAR SNACK
    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    //SE AGREGA EL METODO DE MOSTRAR LOS SNACKS
    public static void mostrarSnack(){
        var inventarioSnacks = "";
        for(var snack : snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(inventarioSnacks);
    }

    //METODO PARA REGRESAR LA LISTA DE OBJETOS TIPO SNACK
    public static List<Snack> getSnacks(){
        return snacks;
    }
}
