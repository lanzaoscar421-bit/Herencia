import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Agenda {

    Set<Contacto> contactos = new TreeSet<Contacto>();
    Scanner sc = new Scanner(System.in);

    public boolean addContacto() {
        boolean resultado = false;

        String nombreC;
        String telefonoC;
        String correoC;


        do {
            System.out.println("Inserte el nombre del contacto");
            System.out.println("Válido siempre que comience por mayúsculas y contenga letras\n");
            nombreC = sc.nextLine();
        } while (!PatronNombre(nombreC));


        do {
            System.out.println("Inserte el telefono del contacto");
            System.out.println("Valido siempre válido siempre que empiece por 6,7 o 9 y tenga en total 9 dígitos");
            telefonoC = sc.nextLine();
        } while (!PatronTelefono(telefonoC));

        do {
            System.out.println("Inserte el correo del contacto");
            System.out.println("válido siempre que aparezcan en la cadena: (carácter a-z ó dígito ó _ ó . ó -), (el\n" +
                    "símbolo @), (caracteres a-z),( punto),( entre dos y cuatro caracteres a-z)");
            correoC = sc.nextLine();
        } while (!PatronCorreo(correoC));

        Contacto nuevo = new Contacto(nombreC, telefonoC, correoC);

        return contactos.add(nuevo);


    }

    public boolean busquedaContacto() {
        boolean resultado = false;

        String nombreBusqueda;

        System.out.println("Inserte el nombre del contacto que quieres guardar");
        nombreBusqueda = sc.nextLine();

        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                System.out.println(c);
                return true;
            }
        }

        System.out.println("Contacto no encontrado");
        return false;
    }

    public boolean eliminarContacto() {

        boolean resultado = false;





        return  resultado;

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
