import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Plato p1 = new Plato("Tacos El Rey", "Taco de Asada", 2.5);
        Plato p2 = new Plato("Sushi Go", "Roll California", 3.0);

        Map<Plato, Integer> pedido = new HashMap<>();
        pedido.put(p1, 2); // $5.00
        pedido.put(p2, 1); // $3.00

        PedidoComida pc = new PedidoComida("Carlos", LocalDate.now().plusDays(1), Arrays.asList(p1, p2), pedido);
        pc.imprimir();

        System.out.println("----");

        PedidoTaxi pt = new PedidoTaxi("Ana", LocalDate.now(), "Av. 1", "Calle 5", 10);
        pt.imprimir();

        PedidoTaxi pt1 = new PedidoTaxi("", LocalDate.now(), "Av. 2", "Calle 5", 10);
        pt1.imprimir();

        PedidoTaxi pt2 = new PedidoTaxi("", LocalDate.now(), "Av. 2", "Calle 5", 10);
        pt2.imprimir();

        PedidoTaxi pt3 = new PedidoTaxi("", LocalDate.now(), "Av. 2", "Calle 5", 10);
        pt3.imprimir();

        PedidoTaxi pt4 = new PedidoTaxi("", LocalDate.now(), "Av. 2", "Calle 5", 10);
        pt4.imprimir();
    }
}
