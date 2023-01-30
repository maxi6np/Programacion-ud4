package HerenciaPolimorfismo.Animales;

public class Perro extends Animal{
    private String lugarTumbarse;

    public Perro(String nombre, int numPatas, Persona dueno, String lugarTumbarse) {
        super(nombre, numPatas, dueno);
        this.lugarTumbarse = lugarTumbarse;
    }

    @Override
    public void comer() {
        System.out.println("come huesos");;
    }

    @Override
    public void emitirSonido() {
        System.out.println("GUUUAAAUUUUUU");;
    }

    public String getLugarTumbarse() {
        return lugarTumbarse;
    }

    public void setLugarTumbarse(String lugarTumbarse) {
        this.lugarTumbarse = lugarTumbarse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Perro{");
        sb.append(super.toString());
        sb.append("lugarTumbarse='").append(lugarTumbarse).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
