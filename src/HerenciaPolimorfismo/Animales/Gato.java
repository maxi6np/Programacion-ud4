package HerenciaPolimorfismo.Animales;

public class Gato extends Animal{
    private String jugueteFavorito;

    public Gato(String nombre, int numPatas, Persona dueno, String jugueteFavorito) {
        super(nombre, numPatas, dueno);
        this.jugueteFavorito = jugueteFavorito;
    }

    @Override
    public void comer() {
        System.out.println("come pescado");;
    }

    @Override
    public void emitirSonido() {
        System.out.println("MIIAAUUUU");;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gato{");
        sb.append(super.toString());
        sb.append("jugueteFavorito='").append(jugueteFavorito).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getJugueteFavorito() {
        return jugueteFavorito;
    }

    public void setJugueteFavorito(String jugueteFavorito) {
        this.jugueteFavorito = jugueteFavorito;
    }
}
