import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        System.out.println("Primer Ejerccio de Arraylist");


        //EJ1
        Producto producto1 = new Producto("Oscar", 1);
        Producto producto2 = new Producto("Guts", 2);
        Producto producto3 = new Producto("Gabimaru", 3);
        Producto producto4 = new Producto("Arbol", 4);
        Producto producto5 = new Producto(",Musasi", 5);

        //EJ2
        ArrayList<Producto> productos = new ArrayList<>();

        //EJ3
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);

        //EJ4
        System.out.println("******************************");
        Iterator<Producto> iterator = productos.iterator();
        Producto cadaProducto;
        while (iterator.hasNext()) {
            cadaProducto = iterator.next();
            System.out.println(cadaProducto.toString());
        }
        System.out.println("******************************");

        //EJ5
        productos.remove(producto1);
        productos.remove(producto2);

        //EJ6
        Producto producto6 = new Producto("Thors", 6);
        productos.add(2, producto6); //Creamos el producto numero 6 en la posicion 5 del Array

        //EJ7

        System.out.println("******************************");
        Iterator<Producto> iterator2 = productos.iterator();
        Producto cadaProducto2;
        while (iterator2.hasNext()) {
            cadaProducto2 = iterator2.next();
            System.out.println(cadaProducto2.toString());
        }
        System.out.println("******************************");

        //EJ8


        





        //EJ9

        productos.removeAll(productos);






    }


}