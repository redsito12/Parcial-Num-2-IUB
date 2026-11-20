/** Utilidad para validar campos obligatorios. */
public final class Validador {
    private Validador() {}

    public static String requerido(String valor, String campo) {
        if (valor == null || valor.isBlank())
            throw new IllegalArgumentException("El campo '" + campo + "' es obligatorio");
        return valor.trim();
    }

    public static <T> T requerido(T valor, String campo) {
        if (valor == null)
            throw new IllegalArgumentException("El campo '" + campo + "' es obligatorio");
        return valor;
    }
}
