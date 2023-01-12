package Unidad4;

public class Ejer4x5 {

    int [] diaSemana = {1,2,3,4,5,6,7};
    public static void main(String[] args) {
        System.out.println(encontrarNombreDia(3));
    }

    public static String encontrarNombreDia (int diaSemana){
        String[ ] nombres = {"Lunes", "Martes", "Miércoles", "Jueves","Viernes", "Sabado", "Domingo"};
        if (diaSemana > 7 || diaSemana < 1){
            return "Dia incorrecto";
        } else {
            return nombres[diaSemana -1 ];
        }
    };
}