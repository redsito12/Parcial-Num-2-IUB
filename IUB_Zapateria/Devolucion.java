import java.time.LocalDate;

/** Devolución de calzado por defectos o inconformidades, asociada a un pedido y opcionalmente a una factura. */
public class Devolucion {
    private Long idDevolucion;
    private LocalDate fecha;
    private String motivo;
    private int cantidadDevuelta;
    private EstadoDevolucion estado;
    private Pedido pedido;
    private Factura factura;   // opcional

    public Devolucion(Long idDevolucion, LocalDate fecha, String motivo, int cantidadDevuelta,
                      EstadoDevolucion estado, Pedido pedido, Factura factura) {
        this.idDevolucion = idDevolucion;
        this.fecha = Validador.requerido(fecha, "fecha");
        this.motivo = Validador.requerido(motivo, "motivo");
        if (cantidadDevuelta <= 0) throw new IllegalArgumentException("La cantidad devuelta debe ser mayor a 0");
        this.cantidadDevuelta = cantidadDevuelta;
        this.estado = Validador.requerido(estado, "estado");
        this.pedido = Validador.requerido(pedido, "pedido");
        this.factura = factura;
    }

    public Long getIdDevolucion() { return idDevolucion; }
    public void setIdDevolucion(Long v) { this.idDevolucion = v; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate v) { this.fecha = Validador.requerido(v, "fecha"); }
    public String getMotivo() { return motivo; }
    public void setMotivo(String v) { this.motivo = Validador.requerido(v, "motivo"); }
    public int getCantidadDevuelta() { return cantidadDevuelta; }
    public void setCantidadDevuelta(int v) { this.cantidadDevuelta = v; }
    public EstadoDevolucion getEstado() { return estado; }
    public void setEstado(EstadoDevolucion v) { this.estado = Validador.requerido(v, "estado"); }
    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido v) { this.pedido = Validador.requerido(v, "pedido"); }
    public Factura getFactura() { return factura; }
    public void setFactura(Factura v) { this.factura = v; }

    @Override public String toString() {
        return "Devolucion{" + idDevolucion + ", " + fecha + ", " + motivo + ", cant=" + cantidadDevuelta + ", " + estado + "}";
    }
}
