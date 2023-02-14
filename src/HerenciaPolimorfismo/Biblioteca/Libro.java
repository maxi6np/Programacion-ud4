package HerenciaPolimorfismo.Biblioteca;

public class Libro extends Elemento implements Prestable {
    private String titulo;
    private int anioPublicacion;
    private String autor;
    private boolean alquilado;

    public Libro(int codigoNumerico, String titulo, int anioPublicacion, String autor) {
        super(codigoNumerico);
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Libro{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", anioPublicacion=").append(anioPublicacion);
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", codigoNumerico=").append(codigoNumerico);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public boolean prestar() {
        if(alquilado){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean devolver() {
        if(alquilado){
            return true;
        }else{
            return false;
        }
    }
}
