import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Bienvenido a tu agenda 📖");

        String opcion = "";



        Agenda agenda = new Agenda();
        do {

            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Visualizar agenda");
            System.out.println("5. Número de contactos de mi agenda");
            System.out.println("6. Salir");


            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    if(agenda.addContacto()){
                        System.out.println("Contacto se añadio correctamente");
                    }else {
                        System.out.println("Contacto ya exsiste, no se pudo añadir");
                    }
                break;
                case "2":
                    agenda.busquedaContacto();

                break;

                case "3":
                    if(agenda.eliminarContacto()){
                        System.out.println("Contacto se eliminado correctamente");
                    }else{
                        System.out.println("Contacto ya exsiste, no se pudo eliminar");
                    }

                break;

                case "4":

                break;

                case "5":

                break;

                case "6":

                    System.out.println("Adios.");

                break;

                default:
                    System.out.println("Porfavor, inserte un numero del 1-6");
                break;




            }

        }while (opcion != "6");






    }
}