public interface Traductor {
    // public y abstract si no definimos lo contrario
    void traducir();

    //Metodos con implementacion default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a ingles");
    }
}

class Frances implements Traductor{
    @Override
    public void traducir(){
        System.out.println("Traduzco a frances");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en frances...");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();
        System.out.println();

        //Traductor en frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}