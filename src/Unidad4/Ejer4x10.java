package Unidad4;

import java.util.Arrays;

public class Ejer4x10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(expandir(new int[]{2, 3, 4, 5, 6})));
    }

    public static int[ ] expandir(int[] numeros){
        int[] expandido = new int[numeros.length * 2];
        for (int i = 0; i < numeros.length; i++) {
            expandido[i * 2] = numeros[i];
            expandido[i * 2 + 1] = numeros[i];
        }
        return expandido;
    }

}
