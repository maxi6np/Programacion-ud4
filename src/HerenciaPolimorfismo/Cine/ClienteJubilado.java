package HerenciaPolimorfismo.Cine;

import java.util.Date;

public class ClienteJubilado extends Clientes{
    private static final double PRECIO_CUOTA = 20;
    private static final String NOMBRE_TIPO_CLIENTE = "Cliente Jubilado";

    public ClienteJubilado(String nombreApellidos, Date fechaNacimiento, String DNI) {
        super(nombreApellidos, fechaNacimiento, PRECIO_CUOTA, DNI);

    }
    @Override
    public void comprarEntrada(Peliculas pelicula) {
        System.out.println(getTextoComprarEntrada(NOMBRE_TIPO_CLIENTE));
    }
}
