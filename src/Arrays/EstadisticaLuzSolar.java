package Arrays;

public class EstadisticaLuzSolar {
    public static void main(String[] args) {
        EstadisticaLuzSolar els = new EstadisticaLuzSolar();
        System.out.println("El mes menos soleado es " + els.mesMenosSoleado());
        System.out.println("El mes mas soleado es " + els.mesMasSoleado());
        System.out.println("La media de las horas del Sol es " + els.getMediaSol());
    }

    private final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private final int[] HORAS;

    public EstadisticaLuzSolar() {
        HORAS = new int[]{100, 90, 120, 150, 210, 250, 300, 310, 280, 230, 160, 120};
    }

    public double getMediaSol() {
        double suma = 0;
        for (int i = 0; i < HORAS.length; i++) {
            double aux = HORAS[i];
            suma += aux;
        }
        return suma / HORAS.length;
    }

    public String mesMasSoleado() {
        int horaMasSol = 0;
        for (int i = 1; i < HORAS.length; i++) {
            if (HORAS[i] > HORAS[horaMasSol]) {
                horaMasSol = i;
            }
        }
        return MESES[horaMasSol];
    }

    public String mesMenosSoleado() {
        int horaMenosSol = 0;
        for (int i = 1; i < HORAS.length; i++) {
            if (HORAS[i] < HORAS[horaMenosSol]) {
                horaMenosSol = i;
            }
        }
        return MESES[horaMenosSol];
    }
}
