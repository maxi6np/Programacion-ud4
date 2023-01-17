package HerenciaPolimorfismo.Articulo;

public class CD extends Articulo{
    public String artista;
    private int numeroPistas;

    public CD(String titulo, int duracion, String artista, boolean loTengo, String comentario, int numeroPistas) {
        super(titulo, duracion,loTengo,comentario);
        this.artista = artista;
        this.numeroPistas = numeroPistas;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CD{");
        sb.append(super.toString());
        sb.append("artista='").append(artista).append('\'');
        sb.append(", numeroPistas=").append(numeroPistas);
        sb.append('}');
        return sb.toString();
    }
}
