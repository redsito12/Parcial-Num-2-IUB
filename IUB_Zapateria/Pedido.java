import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/** Compra realizada por un cliente. */
public class Pedido {
    private Long idPedido;
    private LocalDate fecha;
    private double valorEstimado;
    private EstadoPedido estado;
    private Cliente cliente;
    private List<DetallePedido> detalles = new ArrayList<>();

    public Pedido(Long idPedido, LocalDate fecha, double valorEstimado, EstadoPedido estado, Cliente cliente) {
        this.idPedido = idPedido;
        this.fecha = Validador.requerido(fecha, "fecha");
        this.valorEstimado = valorEstimado;
        this.estado = Validador.requerido(estado, "estado");
        this.cliente = Validador.requerido(cliente, "cliente");
    }

    public void agregarDetalle(DetallePedido d) { detalles.add(d); }

    public Long getIdPedido() { return idPedido; }
    public void setIdPedido(Long v) { this.idPedido = v; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate v) { this.fecha = Validador.requerido(v, "fecha"); }
    public double getValorEstimado() { return valorEstimado; }
    public void setValorEstimado(double v) { this.valorEstimado = v; }
    public EstadoPedido getEstado() { return estado; }
    public void setEstado(EstadoPedido v) { this.estado = Validador.requerido(v, "estado"); }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente v) { this.cliente = Validador.requerido(v, "cliente"); }
    public List<DetallePedido> getDetalles() { return detalles; }

    @Override public String toString() {
        return "Pedido{" + idPedido + ", " + fecha + ", " + estado + ", cliente=" + cliente.getNombre() + "}";
    }
}
