package HerenciaPolimorfismo.Articulo;

public class DVD extends Articulo{
    public String director;

    public DVD(String titulo, int duracion, boolean loTengo, String comentario, String director){
        super(titulo, duracion,loTengo,comentario);
        this.director = director;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DVD{");
        sb.append(super.toString());
        sb.append("director='").append(director).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
