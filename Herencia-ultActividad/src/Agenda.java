public class Agenda {

    private Contacto[] contactosRegistrados;
    private int contadorContactos;

    public Agenda() {
        contactosRegistrados = new Contacto[100];
        contadorContactos = 0;
    }

    //Metodos

    public boolean anadirContacto(Contacto c) {
        boolean resultado = false;

        if (c != null) {
            int index = -1;
            for (int i = 0; i < contadorContactos; i++) {
                if (contactosRegistrados[i].getNombre().equalsIgnoreCase(c.getNombre())) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                contactosRegistrados[contadorContactos] = c;
                contadorContactos++;
                resultado = true;
            }
        }

        return resultado;
    }


    public boolean eliminarContacto(String nombre) {
        boolean resultado = false;
        int index = -1;

        for (int i = 0; i < contadorContactos; i++) {
            if (contactosRegistrados[i] != null) {
                if (contactosRegistrados[i].getNombre().equalsIgnoreCase(nombre)) {
                    index = i;
                    break;
                }
            }
        }

        if (index != -1) {
            contactosRegistrados[index] = contactosRegistrados[contadorContactos - 1];
            contactosRegistrados[contadorContactos - 1] = null;
            contadorContactos--;
            resultado = true;
        }

        return resultado;
    }


    public void listarContactos() {
        if (contadorContactos == 0) {
            System.out.println("Agenda vacía");
        }

        for (int i = 0; i < contadorContactos; i++) {
            System.out.println(contactosRegistrados[i]);
        }
    }
}
