package CineMalva.src;

import java.util.Scanner;

public class InterfazUsuario {

    static Scanner sc = new Scanner(System.in);

    Cine cine = new Cine("Asturias", "Yelmo");

    public void run() {
        aniadirPeliculas();
        boolean seguir = true;
        while (seguir) {
            int opcion = leerNumero("""
                    Selecciona una opción:
                    1. Mostrar películas.
                    2. Mostrar clientes.
                    3. Comprar entrada.
                    4. Salir.""", "Error, introduce un numero (1-4): ");
            switch (opcion) {
                case 1 -> mostrarPeliculas();
                case 2 -> mostrarClientes();
                case 3 -> comprarEntrada();
                case 4 -> seguir = false;
            }
        }
    }

    private void mostrarPeliculas() {
        cine.mostrarPeliculas();
    }

    private void mostrarClientes() {
        cine.mostrarClientes();
    }

    private void comprarEntrada() {
        int n = leerNumero("Introduce el numero de la película", "Error, introduce un número");
        while (n <= 0 || n > cine.getIndex()){
            n = leerNumero("Introduce el numero de la película", "Error, introduce un número");
        }
        cine.comprarEntrada(cine.obtenerPelicula(n-1), new Cliente("", "" ,"", 1));
    }

    private void aniadirPeliculas() {
        cine.anadirPelicula(new Pelicula("Avengers: Endgame", "2020", new String[]{"12:00", "16:30", "20:00", "22:00"}));
        cine.anadirPelicula(new Pelicula("El gato con botas", "2023", new String[]{"10:15", "15:00", "19:00", "21:30"}));
        cine.anadirPelicula(new Pelicula("El menú", "2022", new String[]{"11:30", "16:00", "20:30", "22:45"}));
        cine.anadirPelicula(new Pelicula("Avatar 2", "2023", new String[]{"12:00", "16:30", "20:30", "22:30"}));
    }

    private static int leerNumero(String t1, String t2) {
        System.out.println(t1);
        while (!sc.hasNextInt()) {
            System.out.println(t2);
            sc.nextLine();
        }
        int numero = Integer.parseInt(sc.nextLine());

        return numero;
    }

}
