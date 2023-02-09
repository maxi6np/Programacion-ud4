package HerenciaPolimorfismo.Cine;

import java.util.Arrays;
import java.util.Objects;

public class Peliculas{
    private String titulo;
    private int anioEstreno;
    public int entradasVendidas;
    private double[] horasProyeccion;

    public Peliculas(String titulo, int anioEstreno, double[] horasProyeccion) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.horasProyeccion = horasProyeccion;
        this.entradasVendidas = 0;

    }
    public Peliculas(String titulo, int anioEstreno) {
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
    }
        public String getTitulo() {
        return titulo;
    }
    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setEntradasVendidas(int entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }

    public int getEntrada() {
        return entradasVendidas;
    }
    public double[] getHorasProyeccion() {
        return horasProyeccion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Peliculas{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", anioEstreno=").append(anioEstreno);
        sb.append(", entradasVendidas=").append(entradasVendidas);
        sb.append(", horasProyeccion=").append(Arrays.toString(horasProyeccion));
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peliculas peliculas = (Peliculas) o;
        return anioEstreno == peliculas.anioEstreno && Objects.equals(titulo, peliculas.titulo);
    }

}
