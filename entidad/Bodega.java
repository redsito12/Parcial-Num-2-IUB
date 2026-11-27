public class Bodega {

    private String codigo;
    private String nombre;
    private String ubicacion;

    private Zapato zapato;
    private Proveedor proveedor;
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Zapato getZapato() {
        return zapato;
    }
    public void setZapato(Zapato zapato) {
        this.zapato = zapato;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    
}
