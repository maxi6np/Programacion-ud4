package HerenciaPolimorfismo.Articulo;

public class Articulo {

    public String titulo;
    public int duracion;
    public boolean loTengo;
    public String comentario;

    public Articulo(String titulo, int duracion, boolean loTengo, String comentario){
        this.titulo = titulo;
        this.duracion = duracion;
        this.loTengo = loTengo;
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Articulo{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", duracion=").append(duracion);
        sb.append(", loTengo=").append(loTengo);
        sb.append(", comentario='").append(comentario).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
