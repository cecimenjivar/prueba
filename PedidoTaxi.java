import java.time.LocalDate;

public class PedidoTaxi extends Pedido {
    private final String origen;
    private final String destino;
    private final double distancia;

    public PedidoTaxi(String nombreCliente, LocalDate fecha, String origen, String destino, double distancia) {
        super(nombreCliente, fecha);
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

    @Override
    public double calcularTotal() {
        return distancia * 1.5;
    }

    @Override
    public int calcularPuntos() {
        puntos = (int) (distancia * 2);
        return puntos;
    }

    @Override
    public void imprimir() {
        System.out.println("Pedido de taxi para: " + nombreCliente);
        System.out.println("Origen: " + origen + " -> Destino: " + destino);
        System.out.println("Distancia: " + distancia + " km");
        System.out.println("Total: $" + calcularTotal());
        System.out.println("Puntos: " + calcularPuntos());
    }
}
