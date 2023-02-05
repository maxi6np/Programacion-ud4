package HerenciaPolimorfismo.Cine;

import java.util.Arrays;

public class Peliculas{
    private String titulo;
    private int anioEstreno;
    public int entradasVendidas;
    private double[] horasProyeccion;
    private boolean esInfantil;
    private String productora;
    private static final int MAX_PELICULAS = 5;
    private static final int MAX_VECES_DIA = 4;

    public Peliculas(String titulo, int anioEstreno, double[] horasProyeccion, boolean esInfantil, String productora) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.horasProyeccion = horasProyeccion;
        this.esInfantil = esInfantil;
        this.productora = productora;
        this.entradasVendidas = 0;

    }

    public String getTitulo() {
        return titulo;
    }
    public int getAnioEstreno() {
        return anioEstreno;
    }
    public int getEntradasVendidas() {
        return entradasVendidas;
    }
    public double[] getHorasProyeccion() {
        return horasProyeccion;
    }
    public boolean isEsInfantil() {
        return esInfantil;
    }
    public String getProductora() {
        return productora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Peliculas{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", anioEstreno=").append(anioEstreno);
        sb.append(", entradasVendidas=").append(entradasVendidas);
        sb.append(", horasProyeccion=").append(Arrays.toString(horasProyeccion));
        sb.append(", esInfantil=").append(esInfantil);
        sb.append(", productora='").append(productora).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
