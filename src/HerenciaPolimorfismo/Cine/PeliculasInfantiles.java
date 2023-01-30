package HerenciaPolimorfismo.Cine;

public class PeliculasInfantiles extends Peliculas{
    private String productora;

    public PeliculasInfantiles(String localidad, String nombre, int clientes, String titulo,
                               int anioEstreno, double[] horasProyeccion,String productora) {
        super(localidad, nombre, clientes, titulo, anioEstreno, horasProyeccion);
        this.productora = productora;
        this.entradasVendidas = 0;
    }
}
