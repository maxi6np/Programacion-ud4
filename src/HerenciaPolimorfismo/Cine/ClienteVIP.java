package HerenciaPolimorfismo.Cine;

import java.util.Date;

public class ClienteVIP extends Clientes {
    private static final double PRECIO_CUOTA = 30;
    private static final String NOMBRE_TIPO_CLIENTE = "Cliente VIP";
    private int numEntradas;

    public ClienteVIP(String nombreApellidos, Date fechaNacimiento, double precioCuota, String DNI) {
        super(nombreApellidos, fechaNacimiento, PRECIO_CUOTA, DNI);
        this.numEntradas = 0;

    }

    @Override
    public void comprarEntrada(Peliculas pelicula) {
        if (numEntradas == 5) {
            System.out.println("Entradas gratis");
            numEntradas = 0;
        } else {
            if (!(pelicula instanceof PeliculaInfantil)) {
                numEntradas++;
            }
            System.out.println(getTextoComprarEntrada(NOMBRE_TIPO_CLIENTE));
        }
    }
}
