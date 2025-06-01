import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class PedidoComida extends Pedido {

    private List<Plato> listaPlatos;
    private Map<Plato, Integer> pedidoCliente;

    public PedidoComida(String nombreCliente, LocalDate fecha, List<Plato> listaPlatos, Map<Plato, Integer> pedidoCliente) {
        super(nombreCliente, fecha);
        this.listaPlatos = listaPlatos;
        this.pedidoCliente = pedidoCliente;
    }

    @Override
    public double calcularTotal() {

        double total = 0;

        for (Map.Entry<Plato, Integer> entry : pedidoCliente.entrySet()) {
            total += entry.getValue() * entry.getKey().getPrecio();
        }

        return (total >= 5.99) ? total : total + 1.99;
    }

    @Override
    public int calcularPuntos() {
        double puntos = 0;

        for (Map.Entry<Plato, Integer> entry : pedidoCliente.entrySet()) {
            puntos += entry.getValue() * entry.getKey().getPrecio();
        }

        puntos = puntos * 100;
        return (int) puntos;
    }

    @Override
    public void imprimir() {

        System.out.println("Pedido de comida para: " + nombreCliente);

        for (Map.Entry<Plato, Integer> entry : pedidoCliente.entrySet()) {
            System.out.print(entry.getValue() + " x ");
            entry.getKey().imprimir();
        }

        System.out.println("Total: $" + calcularTotal());
        System.out.println("Puntos: " + calcularPuntos());
    }
}
