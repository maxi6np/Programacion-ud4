package Arrays;

public class ContadorDias {
    public static void main(String[] args) {
        ContadorDias cd = new ContadorDias(31,12,2004);
        System.out.println("Dias desde el inicio del año: " + cd.contarDias());;
    }

    private final int [] diasMes;
    private int dia;
    private int mes;
    private int anio;


    public ContadorDias(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        int febrero;

        if (esBisiesto(anio)) {
            febrero = 29;
        } else {
            febrero = 28;
        }

        diasMes = new int[]{31, febrero, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    }

    public int contarDias() {
        int suma = 0;
        for (int i = 0; i <= mes - 2 ; i++) {
            suma += diasMes[i];
        }
        return suma + dia;
    }

    private boolean esBisiesto(int anio) {
        return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0);
    }
}
