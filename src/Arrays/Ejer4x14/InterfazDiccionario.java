package Arrays.Ejer4x14;

import java.util.Scanner;

public class InterfazDiccionario {

    private Diccionario diccionario;
    private boolean seguir;
    static Scanner sc;

    public InterfazDiccionario() {
        sc = new Scanner(System.in);
        seguir = true;
    }

    public void run() {
        int tamanio = leerNumero("Introduce el tamaño del diccionario (máximo " + Diccionario.MAX_PALABRAS + "):",
                "Error, introduce un numero positivo:");
        diccionario = new Diccionario(tamanio);


        while (seguir) {
            int opcion = leerNumero("""
                    Selecciona una opción:
                    1. Añadir palabra.
                    2. Obtener palabra.
                    3. Traducir palabra.
                    4. Escribir diccionario.
                    5. Salir.""", "Error, introduce un numero (1-4): ");
            switch (opcion) {
                case 1 -> anadirPalabra();
                case 2 -> obtenerPalabra();
                case 3 -> traducirPalabra();
                case 4 -> diccionario.escribirDiccionario();
                case 5 -> seguir = false;
            }
        }
    }

    private void traducirPalabra() {
        int index = leerNumero("Introduce el índice de la palabra: ", "Error, introduce un número entre el 0 y el "
                + Diccionario.MAX_PALABRAS + ": ");
        if (diccionario.existeIndex(index - 1)) {
            System.out.println(diccionario.traducirPalabra(index - 1));
        } else {
            System.out.println("El índice introducido no corresponde con ninguna palabra.");
        }
    }

    private void obtenerPalabra() {
        int index = leerNumero("Introduce el índice de la palabra: ", "Error, introduce un número positivo: ");
        if (diccionario.existeIndex(index - 1)) {
            System.out.println(diccionario.obtenerPalabra(index - 1));
        } else {
            System.out.println("El índice introducido no corresponde con ninguna palabra.");
        }
    }

    private void anadirPalabra() {
        if (diccionario.tieneEspacio()) {
            System.out.println("Introduce la palabra en español:");
            String palabraEs = sc.nextLine();
            System.out.println("Introduce la palabra en inglés:");
            String palabraEn = sc.nextLine();
            diccionario.insertarPalabra(new Palabra(palabraEs, palabraEn));
        } else {
            System.out.println("No hay mas sitio en la lista");
        }
    }


    private int leerNumero(String t1, String t2) {
        System.out.println(t1);
        while (!sc.hasNextInt()) {
            System.out.println(t2);
            sc.nextLine();
        }
        int numero = Integer.parseInt(sc.nextLine());

        return numero;
    }


}
