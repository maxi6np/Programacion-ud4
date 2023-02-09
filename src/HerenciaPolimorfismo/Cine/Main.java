package HerenciaPolimorfismo.Cine;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Cine cine = new  Cine("Los Prados","Oviedo");
    private static ArrayList<String> listaPeliculas = new ArrayList<>();
    private static ArrayList<String> numClientes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        int opcionMenu;
        do {
            System.out.println("***********************************");
            System.out.println("Cine " + cine.getNombre());
            System.out.println("1 - Mostar cartelera");
            System.out.println("2 - Mostar listado de clientes");
            System.out.println("3 - Salir");
            System.out.println("Elige una de las opciones (1-3):");
            System.out.println("***********************************");

            while (!sc.hasNextInt()) {
                System.out.println("Error. Introduzca un número mayor de cero");
                sc.nextLine();
            }
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1 -> cartelera();
                case 2 -> listadoClientes();
                case 3 -> {
                    System.out.println("Programa finalizado");
                    salir = false;
                }
                default -> System.out.println("Error. Elija una opción disponible");

            }
        } while (salir);
    }

    private static void cartelera() {
        System.out.println("\nLista de películas:");
    }

    private static void listadoClientes() {
        System.out.println("\nLista de clientes:");

    }
}
