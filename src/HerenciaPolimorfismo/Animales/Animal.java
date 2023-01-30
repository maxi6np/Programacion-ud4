package HerenciaPolimorfismo.Animales;

public abstract class Animal{
    private String nombre;
    private int numPatas;
    private Persona dueno;

    public Animal(String nombre, int numPatas, Persona dueno){
        super();
        this.dueno = dueno;
        this.numPatas = numPatas;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public Persona getDueno() {
        return dueno;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }

    public abstract void comer();
    public abstract void emitirSonido();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", numPatas=").append(numPatas);
        sb.append(", dueno=").append(dueno);
        sb.append('}');
        return sb.toString();
    }
}
