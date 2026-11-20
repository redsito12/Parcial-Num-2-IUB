/** Cargo que desempeña un trabajador (cortador, guarnecedor, solador, auxiliar de bodega, supervisor...). */
public class Cargo {
    private Long idCargo;
    private String nombre;
    private String descripcion;

    public Cargo(Long idCargo, String nombre, String descripcion) {
        this.idCargo = idCargo;
        this.nombre = Validador.requerido(nombre, "nombre");
        this.descripcion = descripcion;
    }

    public Long getIdCargo() { return idCargo; }
    public void setIdCargo(Long idCargo) { this.idCargo = idCargo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = Validador.requerido(nombre, "nombre"); }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override public String toString() { return "Cargo{" + idCargo + ", " + nombre + "}"; }
}
