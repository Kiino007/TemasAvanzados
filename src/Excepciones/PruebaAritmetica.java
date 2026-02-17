package Excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        //Este bloque se va ejecutar cuando hay un error
        try{
            var resultado = Aritmetica.division(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        }
        //Este bloque se ejecuta siempre
        finally {
            System.out.println("Se reviso la division entre cero");
        }

    }
}
