import java.time.LocalDate;
import java.util.Scanner;
public class ProgramaAgenda {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Agenda nuevAgenda = new Agenda();
        String opcion  = "";

        do {

            menu();

            opcion = sc.nextLine();

            switch (opcion) {

                case "1":
                    anadirPersona(sc, nuevAgenda);
                    break;

                case "2":
                    anadirEmpresa(sc, nuevAgenda);

                    break;

                case "3":
                    eliminarContacto(sc, nuevAgenda);
                    break;

                case "4":
                    nuevAgenda.listarContactos();
                    break;

                case "5":
                    System.out.println("Saliendo de la agenda...");
                    break;

                default:
                    System.out.println("Porfavor pulse un numero del 1-5");
            }

        } while (!opcion.equals("5"));

    }

    private static void eliminarContacto(Scanner sc, Agenda nuevAgenda) {
        System.out.print("Nombre del contacto a eliminar: ");
        String nombreEliminar = sc.nextLine();

        boolean resultado3 = (nuevAgenda.eliminarContacto(nombreEliminar));

        if (resultado3){
            System.out.println("Contacto eliminado");
        }else{
            System.out.println("No se encontró el contacto");
        }
    }

    private static void anadirEmpresa(Scanner sc, Agenda nuevAgenda) {
        System.out.print("Nombre: ");
        String nombreEmpresa = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefonoEmpresa = sc.nextLine();

        System.out.print("Web: ");
        String web = sc.nextLine();

        Contacto empresa = new Empresa(nombreEmpresa, telefonoEmpresa, web);

        boolean resultado2 = nuevAgenda.anadirContacto(empresa);
        if (resultado2){
            System.out.println("Empresa añadida correctamente");
        }else{
            System.out.println("Ya existe un contacto con ese nombre");
        }
    }

    private static void anadirPersona(Scanner sc, Agenda nuevAgenda) {
        System.out.print("Nombre: ");
        String nombrePersona = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefonoPersona = sc.nextLine();

        System.out.print("Año de nacimiento: 2006-12-07 ");
        LocalDate fechaNacimientoP = LocalDate.parse(sc.nextLine());


        Contacto persona = new Personas(nombrePersona, telefonoPersona, fechaNacimientoP);
        boolean resultado = nuevAgenda.anadirContacto(persona);

        if (resultado){
            System.out.println("Persona añadida correctamente");
        }else System.out.println("Ya existe un contacto con ese nombre");
    }

    private static void menu() {
        System.out.println("===== AGENDA =====");
        System.out.println("1. Añadir persona");
        System.out.println("2. Añadir empresa");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Listar contactos");
        System.out.println("5. Salir");
    }
}