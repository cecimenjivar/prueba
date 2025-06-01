public class Plato {

    private String restaurante;
    private String nombre;
    private double precio;

    public Plato(String restaurante, String nombre, double precio) {
        this.restaurante = restaurante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void imprimir() {
        System.out.println("Restaurante: " + restaurante);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }
}
