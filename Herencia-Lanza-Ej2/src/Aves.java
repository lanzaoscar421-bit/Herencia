import java.time.LocalDate;

public abstract class Aves extends Mascotas {

    private boolean pico;
    private boolean vuela;


    public Aves(String nombre, int edad, String estado, LocalDate fechaNacimiento, String tipo, boolean pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento, tipo);
        this.pico = pico;
        this.vuela = vuela;
    }

    public boolean isPico() {
        return pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void vuela() {}

}
