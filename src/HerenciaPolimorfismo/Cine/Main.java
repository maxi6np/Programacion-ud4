package HerenciaPolimorfismo.Cine;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Cine cine = new Cine("Los Prados","Oviedo");
    private static ArrayList<String> listaPeliculas = new ArrayList<>();
    private static ArrayList<String> numClientes = new ArrayList<>();
    private static final int MAX_PELICULAS = 5;
    private static final int MAX_VECES_DIA = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        int opcionMenu;
        do {
            System.out.println("***********************************");
            System.out.println("Cine " + cine.getNombre());
            System.out.println("1 - Mostar cartelera");
            System.out.println("2 - Mostar listado de clientes");
            System.out.println("3 - Añadir cliente");
            System.out.println("4 - Añadir película");
            System.out.println("5 - Salir");
            System.out.println("Elige una de las opciones (1-5):");
            System.out.println("***********************************");

            while (!sc.hasNextInt()) {
                System.out.println("Error. Introduzca un número mayor de cero");
                sc.nextLine();
            }
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1 -> cartelera();
                case 2 -> listadoClientes();
                case 3 -> anadirCliente();
                case 4 -> anadirPelicula();
                case 5 -> {
                    System.out.println("Programa finalizado");
                    salir = false;
                }
                default -> System.out.println("Error. Elija una opción disponible");

            }
        } while (salir);
    }

    private static void cartelera() {
        System.out.println("\nLista de películas:");
        for (int i = 0; i < listaPeliculas.size(); i++) {
            System.out.println(i + 1 + ". " + listaPeliculas.get(i));
        }
    }

    private static void anadirPelicula() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nNombre de la película: ");
        String nombre = scanner.nextLine();

        listaPeliculas.add(nombre);
        System.out.println("Película añadida");
    }

    private static void listadoClientes() {
        System.out.println("\nLista de clientes:");
        for (int i = 0; i < numClientes.size(); i++) {
            System.out.println(i + 1 + ". " + numClientes.get(i));
        }
    }

    private static void anadirCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nNombre del cliente: ");
        String nombre = scanner.nextLine();

        numClientes.add(nombre);
        System.out.println("Cliente añadido");
    }
}
