/** Persona o comercio que compra calzado. Obligatorios: nombre, apellido, tipo y número de documento. */
public class Cliente {
    private Long idCliente;
    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;
    private String direccion;   // opcional
    private String telefono;    // opcional
    private String correo;      // opcional

    public Cliente(Long idCliente, String nombre, String apellido, TipoDocumento tipoDocumento,
                   String numeroDocumento, String direccion, String telefono, String correo) {
        this.idCliente = idCliente;
        this.nombre = Validador.requerido(nombre, "nombre");
        this.apellido = Validador.requerido(apellido, "apellido");
        this.tipoDocumento = Validador.requerido(tipoDocumento, "tipoDocumento");
        this.numeroDocumento = Validador.requerido(numeroDocumento, "numeroDocumento");
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Long getIdCliente() { return idCliente; }
    public void setIdCliente(Long idCliente) { this.idCliente = idCliente; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = Validador.requerido(nombre, "nombre"); }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = Validador.requerido(apellido, "apellido"); }
    public TipoDocumento getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(TipoDocumento t) { this.tipoDocumento = Validador.requerido(t, "tipoDocumento"); }
    public String getNumeroDocumento() { return numeroDocumento; }
    public void setNumeroDocumento(String n) { this.numeroDocumento = Validador.requerido(n, "numeroDocumento"); }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    @Override public String toString() {
        return "Cliente{" + idCliente + ", " + nombre + " " + apellido + ", " + tipoDocumento + " " + numeroDocumento + "}";
    }
}
