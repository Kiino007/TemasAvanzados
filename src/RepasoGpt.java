import java.util.Scanner;

public class RepasoGpt {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var error = "Error: las notas deben estar entre 0 y 10";
        String resultado = "";
        double[] notas = new double[3];
        double suma = 0.0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " (0 a 10): ");
            double nota = consola.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notas[i] = nota;
                suma = suma+nota;
            }else {
                System.out.println(error);
                i--;
            }
        }

        double promedio = suma / notas.length;

        // String resultado = (promedio >= 6) ? "Aprobado" : "Reprobado";  con esto hacemos lo mismo que abajo pero mas corto
        if (promedio > 6 && promedio <= 10) {
            resultado = "Aprobado";
        }else resultado = "Reprobado";

        System.out.printf("\nEl promedio es: %.2f \n %s", promedio, resultado);
    }
}
