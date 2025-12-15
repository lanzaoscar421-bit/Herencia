import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String  opcion = "";

        Inventario nuevoinventario = null;
        Mascotas nuevaMascota = null;




        do {
            System.out.println("\n===== MENU TIENDA DE MASCOTAS =====");
            System.out.println("1. Mostrar lista de animales (tipo y nombre)");
            System.out.println("2. Mostrar todos los datos de un animal");
            System.out.println("3. Mostrar todos los datos de todos los animales");
            System.out.println("4. Insertar animal");
            System.out.println("5. Eliminar animal");
            System.out.println("6. Vaciar inventario");
            System.out.println("7 Salir");

            opcion = sc.nextLine();


            switch (opcion){
                case "1":
                    nuevoinventario.verLista();
                    break;

                case "2":

                    String nombreAnimalBusqueda;
                    System.out.println("Inserte el nombre del animal para ver la informacion");
                    nombreAnimalBusqueda = sc.nextLine();
                    nuevoinventario.mostrarAnimal(nombreAnimalBusqueda);
                    break;

                case "3":
                    nuevoinventario.mostrarTodos();
                    break;

                case "4":
                    String nombre;
                    int edad;
                    String estado;
                    LocalDate fechaNacimiento;

                    System.out.println("Inserte el nombre del animal");
                    nombre = sc.nextLine();
                    System.out.println("Inserte su edad");
                    edad = sc.nextInt();;
                    System.out.println("Inserte su estado");
                    estado = sc.nextLine();
                    System.out.println("Inserte la fecha de nacimiento el formato es este 2006-07-26");
                    fechaNacimiento=LocalDate.parse(sc.nextLine());
                    System.out.print("Tipo (perro/gato/loro/canario): ");
                    String tipo = sc.nextLine().toLowerCase();






                    break;

                case "5":

                    String nombreBorrar;

                    System.out.println("Inserte el nombre del animal que desea borrar");
                    nombreBorrar = sc.nextLine();

                    nuevoinventario.eliminarMascota(nombreBorrar);
                    break;

                case "6":
                   nuevoinventario.vaciarInventario();

                   System.out.println("Se vacio correctamente");


                    break;

                case "7":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        }while (!opcion.equals(7));


    }
}