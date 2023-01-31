package HerenciaPolimorfismo.Figura;

public interface Movible {
    public static void main(String[] args) {
        GestorFiguras gf = new GestorFiguras();
        gf.testMovibles();
    }

    void moverHorizontal(int desp);
    void moverVertical(int desp);
}
