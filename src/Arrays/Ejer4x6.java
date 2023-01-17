package Arrays;

public class Ejer4x6 {
    public static void main(String[] args) {
        System.out.println(calcularMedia(new double[]{2.5,6.7,8.9,3.2}));
    }


    public static double calcularMedia(double[ ] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length ; i++) {
            suma += notas[i];
        }
        return  suma / notas.length;
    };

}
