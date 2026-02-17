package maquina_snacks;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contadorSnacks = 0;
    private int idSnak;
    private String nombre;
    private double precio;

    // CONSTRUCTOR VACÍO
    public Snack(){
        this.idSnak = ++Snack.contadorSnacks;
    }

    // CONSTRUCTOR CON ARGUMENTOS
    public Snack(String nombre, double precio){
        this(); //Llamada al contructor vacio, siempre debe ser la primera linea
        this.nombre = nombre; //Atributos
        this.precio = precio;
    }

    // MÉTODOS GETTER Y SETTER
    // Permiten leer (get) y modificar (set) los atributos privados de forma segura (Encapsulamiento)
    public static int getContadorSnacks() {
        return contadorSnacks;
    }

    public int getIdSnak() {
        return this.idSnak;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Indica que estamos sobrescribiendo el metodo de la clase object
    @Override
    public String toString() {
        // Este metodo define cómo se verá el objeto cuando lo imprimas (ej. System.out.println(miSnack))
        // Devuelve una cadena de texto con los valores actuales de los atributos
        return "Snack{" +
                "idSnak=" + idSnak +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    //
    @Override
    public boolean equals(Object o) {
        // 1. Verificación básica: si el objeto es nulo o de una clase distinta, no son iguales
        if (o == null || getClass() != o.getClass()) return false;

        // 2. "Casting": Convertimos el objeto genérico 'o' a tipo 'Snack' para comparar sus atributos
        Snack snack = (Snack) o;

        // 3. Comparación lógica: Dos snacks son iguales solo si coinciden su ID, su precio y su nombre
        // Se usa Objects.equals para el nombre para evitar errores si el texto es nulo
        return idSnak == snack.idSnak && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        // Genera un número entero único (ID matemático) basado en los atributos del objeto
        // Es vital para que el objeto funcione correctamente en Mapas (HashMap) o Sets (HashSet)
        // Si dos objetos son iguales según equals(), deben devolver el mismo hashCode
        return Objects.hash(idSnak, nombre, precio);
    }
}
