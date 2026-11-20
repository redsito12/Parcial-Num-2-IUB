import java.time.LocalDateTime;

public class OrdenProduccion {

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaEstimadaEntrega;
    private int cantidad;
    private EstadoOrden estadoOrden;
    private Zapato zapato;
    private Trabajador trabajadorEncargado;

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDateTime getFechaEstimadaEntrega() {
        return fechaEstimadaEntrega;
    }
    public void setFechaEstimadaEntrega(LocalDateTime fechaEstimadaEntrega) {
        this.fechaEstimadaEntrega = fechaEstimadaEntrega;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public EstadoOrden getEstadoOrden() {
        return estadoOrden;
    }
    public void setEstadoOrden(EstadoOrden estadoOrden) {
        this.estadoOrden = estadoOrden;
    }
    public Zapato getZapato() {
        return zapato;
    }
    public void setZapato(Zapato zapato) {
        this.zapato = zapato;
    }
    public Trabajador getTrabajadorEncargado() {
        return trabajadorEncargado;
    }
    public void setTrabajadorEncargado(Trabajador trabajadorEncargado) {
        this.trabajadorEncargado = trabajadorEncargado;
    }

    
}
