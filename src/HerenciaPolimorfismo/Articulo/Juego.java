package HerenciaPolimorfismo.Articulo;

public class Juego extends Articulo{
    public int numJugadores;

    public Juego(String titulo, int duracion, int numJugadores, boolean loTengo, String comentario){
        super(titulo, duracion,loTengo,comentario);
        this.numJugadores = numJugadores;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Juego{");
        sb.append(super.toString());
        sb.append("numJugadores=").append(numJugadores);
        sb.append('}');
        return sb.toString();
    }
}
