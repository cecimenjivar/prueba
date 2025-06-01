import java.time.LocalDate;

public abstract class Pedido implements InterfacePedido {

    protected String nombreCliente;
    protected LocalDate fecha;
    protected int puntos;

    public Pedido(String nombreCliente, LocalDate fecha) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.puntos = 0;
    }

    @Override
    public final boolean programarPedido() {
        return !fecha.isBefore(LocalDate.now());
    }

    @Override
    public abstract double calcularTotal();

    @Override
    public abstract int calcularPuntos();

    @Override
    public abstract void imprimir();
}
