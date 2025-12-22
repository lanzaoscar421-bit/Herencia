import java.time.LocalDate;

public class Personas extends Contacto{

    private LocalDate cumpleanos;

    public Personas(String nombre, String telefono, LocalDate cumpleanos) {
        super(nombre, telefono);
        this.cumpleanos = cumpleanos;
    }

    @Override
    public String toString() {
        return "Persona | Nombre: " + nombre +
                " | Teléfono: " + telefono +
                " | Cumpleaños: " + cumpleanos;
    }

}
