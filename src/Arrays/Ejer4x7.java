package Arrays;

public class Ejer4x7 {
    public static void main(String[] args) {
        System.out.println(numeroMaximo(new int[]{-1,-2,-56,-4,-5,-8}));
    }

    public static int numeroMaximo(int [] numeros){
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.length; i++){
             if(numeros[i] > maximo){
                 maximo = numeros[i];
             }
        }
        return maximo;
    }
}
