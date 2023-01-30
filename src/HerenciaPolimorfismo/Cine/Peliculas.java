package HerenciaPolimorfismo.Cine;

public class Peliculas extends Cine {
    private String titulo;
    private int anioEstreno;
    public int entradasVendidas;
    private double[] horasProyeccion;
    private final int MAX_PELICULAS = 5;


    public Peliculas(String localidad, String nombre, int clientes, String titulo, int anioEstreno,
                     double[] horasProyeccion) {
        super(localidad, nombre, clientes);
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.entradasVendidas = 0;
        this.horasProyeccion = horasProyeccion;
    }
}
