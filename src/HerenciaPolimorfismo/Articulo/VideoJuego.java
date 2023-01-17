package HerenciaPolimorfismo.Articulo;

public class VideoJuego extends Juego{

    public String plataforma;

    public VideoJuego(String titulo, int duracion, int numJugadores, String plataforma, boolean loTengo, String comentario){
        super(titulo, duracion, numJugadores,loTengo,comentario);
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoJuego{");
        sb.append(super.toString());
        sb.append("plataforma='").append(plataforma).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
