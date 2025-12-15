import java.time.LocalDate;

public abstract class Mascotas {
    private String nombre;
    private int edad;
    private String estado;
    private LocalDate fechaNacimiento;
    private String tipo;

    public Mascotas(String nombre, int edad, String estado, LocalDate fechaNacimiento, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract void info();

    public abstract void habla();

    public void cumplirAnios() {
        edad++;
    }

    public void morir() {
        estado = "Fallecido";
    }


}

