import java.util.Scanner;
import java.util.regex.Pattern;

public class Contacto {

    Scanner sc = new Scanner(System.in);


    private String nombre;
    private int telefono;
    private String correo;

    public Contacto(String nombre, int telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                '}';
    }

    //Metodos


    public boolean addContacto(Contacto c) {
        boolean resultado = false;

        String nombreC;
        int telefonoC;
        String correoC;



        do {
            System.out.println("Inserte el nombre del contacto");
            System.out.println("Válido siempre que comience por mayúsculas y contenga letras\n");
            nombreC = sc.nextLine();
        }while (!PatronNombre(nombreC));

        System.out.println("Inserte el telefono del contacto");

        return resultado;
    }

    static boolean PatronNombre(String nombre) {
        String patron = "^[A-Z][a-zA-Z]*$";
        return Pattern.matches(patron, nombre);
    }
    static boolean PatronTelefono(String telefono) {
        String patron = "^[679][0-9]{8}$";
        return Pattern.matches(patron, telefono);
    }
    static boolean PatronCorreo(String correo) {
        String patron = "^[a-zA-Z0-9_.-]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}$";
        return Pattern.matches(patron, correo);
    }





}
