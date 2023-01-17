package Arrays;

import java.util.Arrays;

public class TareaArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fusionar(new int[]{1, 2, 3, 4}, new int[]{9, 8, 7, 6})));
        System.out.println(Arrays.toString(genera(1034)));
        System.out.println(Arrays.toString(ordena(new int[]{52, 123, 6, 0, 99, 98})));
        System.out.println(Arrays.toString(inserta(new float[]{4, (float) 5.2, (float) 0.2, 1, 5}, 100, 2)));
    }

    public static int[] fusionar(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            resultado[i] = array1[i];
        }

        for (int j = 0; j < array2.length; j++) {
            resultado[array1.length + j] = array2[j];
        }

        return resultado;
    }


    public static int[] genera(int numero) {
        int cantidadCifras = Integer.toString(numero).length();
        int[] resultado = new int[cantidadCifras];

        for (int i = cantidadCifras; i > 0; i--) {
            resultado[i - 1] = numero % 10;
            numero /= 10;
        }
        return resultado;
    }

    public static int[] ordena(int[] enteros) {
        int aux;

        for (int i = 0; i < enteros.length - 1; i++) {
            for (int j = 0; j < enteros.length - i - 1; j++) {
                if (enteros[j + 1] < enteros[j]) {
                    aux = enteros[j + 1];
                    enteros[j + 1] = enteros[j];
                    enteros[j] = aux;
                }
            }
        }
        return enteros;
    }

    public static float[] inserta(float[] array, float valor, int posicion){
        float[] nuevoArray = new float[array.length + 1];

        if (posicion > array.length || posicion < 0){
            return array;
        }
        for (int i = 0; i < posicion; i++) {
             nuevoArray[i] = array[i];
        }
        nuevoArray[posicion] = valor;

        for (int j = posicion; j < nuevoArray.length - 1; j++) {
            nuevoArray[j + 1] = array[j];
        }

        return nuevoArray;

    }
}
