import java.time.LocalDateTime;

public class Pedido {
    
    private LocalDateTime fecha;
    private double valorEstimado;

    private EstadoPedido estado;
    private Zapato zapato;
    private Factura factura;

    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public double getValorEstimado() {
        return valorEstimado;
    }
    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }
    public EstadoPedido getEstado() {
        return estado;
    }
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
    public Zapato getZapato() {
        return zapato;
    }
    public void setZapato(Zapato zapato) {
        this.zapato = zapato;
    }
    public Factura getFactura() {
        return factura;
    }
    public void setFactura(Factura factura) {
        this.factura = factura;
    } 
}
