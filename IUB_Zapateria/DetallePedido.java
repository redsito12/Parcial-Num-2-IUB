/** Línea de un pedido: qué zapato y cuántos pares (relación N:M entre Pedido y Zapato). */
public class DetallePedido {
    private Zapato zapato;
    private int cantidad;
    private double precioUnitario;

    public DetallePedido(Zapato zapato, int cantidad) {
        this.zapato = Validador.requerido(zapato, "zapato");
        if (cantidad <= 0) throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        this.cantidad = cantidad;
        this.precioUnitario = zapato.getPrecioUnitario();
    }

    public double getSubtotal() { return cantidad * precioUnitario; }

    public Zapato getZapato() { return zapato; }
    public void setZapato(Zapato v) { this.zapato = Validador.requerido(v, "zapato"); }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int v) { this.cantidad = v; }
    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double v) { this.precioUnitario = v; }

    @Override public String toString() {
        return "DetallePedido{" + zapato.getReferencia() + " x" + cantidad + " = " + getSubtotal() + "}";
    }
}
