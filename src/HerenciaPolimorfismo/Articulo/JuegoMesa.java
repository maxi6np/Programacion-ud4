package HerenciaPolimorfismo.Articulo;

public class JuegoMesa extends Juego{

    public JuegoMesa(String titulo, int duracion, int numJugadores, boolean loTengo, String comentario) {
        super(titulo, duracion, numJugadores ,loTengo,comentario);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JuegoMesa{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
