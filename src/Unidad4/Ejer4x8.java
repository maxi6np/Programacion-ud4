package Unidad4;

import java.util.Arrays;

public class Ejer4x8 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numerosPares(new int[]{2, 5, 4, 9, 78})));
    }

    public static int[] numerosPares (int [] numeros){
        int[] pares = new int[numeros.length];
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0){
                pares [cont] = numeros[i];
                cont++;
            }
        }
        return pares;

    }
}
