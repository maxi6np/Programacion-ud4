package Unidad4;

import java.util.Random;

public class Ejer4x11 {
    public static void main(String[] args) {
        imprimirArray(calcularFrecuencias());

    }

    public static int[] calcularFrecuencias() {
        Random random = new Random();
        int[] frecuencia = new int[9];

        for (int i = 0; i < 100; i++) {
            int numeroRandom = random.nextInt(9) + 1;
            frecuencia[numeroRandom - 1]++;
        }
        return frecuencia;
    }

    private static void imprimirArray(int[] numeros){
        for (int i = 1; i <= numeros.length - 1; i++) {
            System.out.println("Frecuencia de " + i + ": " + numeros[i]);
        }
    }
}
