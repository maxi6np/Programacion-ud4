package Unidad4;

import java.util.Arrays;

public class Ejer4x9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotarDerecha(new int[]{2, 5, 7, 9})));
    }
    public static int[] rotarDerecha(int[ ] numeros){
        int ultimo = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = ultimo;
        return numeros;
    }

}
