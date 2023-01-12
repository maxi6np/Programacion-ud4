package Unidad4.Ejer4x14;

import java.util.Scanner;

public class InterfazDiccionario {
    public static void main(String[] args) {
        System.out.println();
    }

    private static boolean stop = true;
    static Scanner sc = new Scanner(System.in);
    private static int opcionMenu = 0;


    public static void menu() {
        do {
            System.out.println("********************************");
            System.out.println("1.- Añadir una nueva palabra");
            System.out.println("2.- Mostrar el diccionario");
            System.out.println("3.- Traducir una palabra de una posición");
            System.out.println("4.- Insertar una palabra");
            System.out.println("5.- Salir");
            System.out.println("********************************");
            opcionMenu = sc.nextInt();

            if (opcionMenu >= 1 && opcionMenu <= 5) {
                switch (opcionMenu) {
                    case 1 -> System.out.println();
                    case 2 -> System.out.println();
                    case 3 -> System.out.println();
                    case 4 -> System.out.println();
                    case 5 -> {
                        System.out.println(finPrograma());
                        stop = false;
                    }
                }
            } else {
                System.out.println("Entrada incorrecta");
            }
            opcionMenu = 0;
        } while (stop);

    }

    public static String finPrograma() {
        return "Fin del programa";

    }


}
