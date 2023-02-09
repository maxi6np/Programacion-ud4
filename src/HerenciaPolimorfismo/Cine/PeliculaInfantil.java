package HerenciaPolimorfismo.Cine;

public class PeliculaInfantil extends Peliculas{
    private String productora;
    public PeliculaInfantil(String titulo, int anioEstreno, double[] horasProyeccion, String productora) {
        super(titulo, anioEstreno, horasProyeccion);
        this.productora = productora;
    }
}
