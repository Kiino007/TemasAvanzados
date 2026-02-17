public class ClaseAbstracta {
    public static void main(String[] args) {

//        FiguraGeometrica figuraGeometrica = new FiguraGeometrica(); Error no se puede crear un objeto sobre la clase abstracta
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

//Clase abstracta
abstract class FiguraGeometrica{ //No se pueden instancia
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se dibuja un rectangulo");
    }
}

class Circulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se dibuja un circulo");
    }
}
