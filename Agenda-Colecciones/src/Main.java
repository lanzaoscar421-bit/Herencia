import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Bienvenido a tu agenda 📖");

        String opcion = "";


        do {

            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto\n");
            System.out.println("3. Eliminar contacto\n");
            System.out.println("4. Visualizar agenda\n");
            System.out.println("5. Número de contactos de mi agenda");
            System.out.println("6. Salir\n");


            opcion = sc.nextLine();

            switch (opcion) {
                case "1":

                break;
                case "2":

                break;

                case "3":

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