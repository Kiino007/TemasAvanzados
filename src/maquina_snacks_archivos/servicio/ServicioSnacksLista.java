package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks{
    private static final List<Snack> snacks;

    //BLOQUE STATIC INICIALIZADOR
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("gaseosa", 120));
    }

    //SE AGREGA EL METODO DE AGREGAR SNACK
    public void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    //SE AGREGA EL METODO DE MOSTRAR LOS SNACKS
    public void mostrarSnack(){
        var inventarioSnacks = "";
        for(var snack : snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(inventarioSnacks);
    }

    //METODO PARA REGRESAR LA LISTA DE OBJETOS TIPO SNACK
    public List<Snack> getSnacks(){
        return snacks;
    }
}
