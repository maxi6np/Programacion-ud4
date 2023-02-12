package HerenciaPolimorfismo.Biblioteca;

public class Videojuego extends Elemento{
    private String titulo;
    private int edadMinimaRecomendada;

    public Videojuego(int codigoNumerico, String titulo, int edadMinimaRecomendada) {
        super(codigoNumerico);
        this.titulo = titulo;
        this.edadMinimaRecomendada = edadMinimaRecomendada;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Videojuego{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", edadMinimaRecomendada=").append(edadMinimaRecomendada);
        sb.append(", codigoNumerico=").append(codigoNumerico);
        sb.append('}');
        return sb.toString();
    }
}
