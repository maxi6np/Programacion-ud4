package Academia;

public class CursoTeorico extends Curso{
    public boolean oficial;

    public CursoTeorico(String nombre, double precio, int horasDuracion,boolean oficial) {
        super(nombre, precio, horasDuracion);
        this.oficial = oficial;
    }

    public boolean getOficial() {
        return oficial;
    }

    public void setOficial(boolean oficiales) {
        this.oficial = oficiales;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CursoTeorico{");
        sb.append(super.toString());
        sb.append("oficial=").append(oficial);
        sb.append('}');
        return sb.toString();
    }
}
