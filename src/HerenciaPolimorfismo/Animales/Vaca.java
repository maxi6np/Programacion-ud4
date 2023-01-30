package HerenciaPolimorfismo.Animales;

public class Vaca extends Animal{

    public Vaca(String nombre, int numPatas, Persona dueno) {
        super(nombre, numPatas, dueno);
    }

    @Override
    public void comer() {
        System.out.println("come hierba");;
    }

    @Override
    public void emitirSonido() {
        System.out.println("MUUUUUUUUUUUUUUU");;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vaca{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
