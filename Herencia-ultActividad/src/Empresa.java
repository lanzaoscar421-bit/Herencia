public class Empresa extends Contacto{

    private String web;

    public Empresa(String nombre, String telefono, String web) {
        super(nombre, telefono);
        this.web = web;
    }

    @Override
    public String toString() {
        return "Empresa | Nombre: " + nombre +
                " | Teléfono: " + telefono +
                " | Web: " + web;
    }
}
