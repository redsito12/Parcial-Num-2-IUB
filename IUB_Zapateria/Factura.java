import java.time.LocalDate;

/** Documento de cobro emitido a partir de un pedido. */
public class Factura {
    private String numeroFactura;
    private LocalDate fechaEmision;
    private double subtotal;
    private double impuestos;
    private double total;
    private MetodoPago metodoPago;
    private Pedido pedido;

    public Factura(String numeroFactura, LocalDate fechaEmision, double subtotal, double impuestos,
                   MetodoPago metodoPago, Pedido pedido) {
        this.numeroFactura = Validador.requerido(numeroFactura, "numeroFactura");
        this.fechaEmision = Validador.requerido(fechaEmision, "fechaEmision");
        this.subtotal = subtotal;
        this.impuestos = impuestos;
        this.total = subtotal + impuestos;
        this.metodoPago = Validador.requerido(metodoPago, "metodoPago");
        this.pedido = Validador.requerido(pedido, "pedido");
    }

    public String getNumeroFactura() { return numeroFactura; }
    public void setNumeroFactura(String v) { this.numeroFactura = Validador.requerido(v, "numeroFactura"); }
    public LocalDate getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(LocalDate v) { this.fechaEmision = Validador.requerido(v, "fechaEmision"); }
    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double v) { this.subtotal = v; this.total = v + impuestos; }
    public double getImpuestos() { return impuestos; }
    public void setImpuestos(double v) { this.impuestos = v; this.total = subtotal + v; }
    public double getTotal() { return total; }
    public MetodoPago getMetodoPago() { return metodoPago; }
    public void setMetodoPago(MetodoPago v) { this.metodoPago = Validador.requerido(v, "metodoPago"); }
    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido v) { this.pedido = Validador.requerido(v, "pedido"); }

    @Override public String toString() {
        return "Factura{" + numeroFactura + ", " + fechaEmision + ", total=" + total + ", " + metodoPago + "}";
    }
}
