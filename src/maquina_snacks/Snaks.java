package maquina_snacks;

import java.util.ArrayList;

public class Snaks {
    private static final List<Snack> snacks;

    //BLOQUE STATIC INICIALIZADOR
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("gaseosa", 120));
    }
}
