package HerenciaPolimorfismo.Cine;

public class Cine {
    private String localidad;
    private String nombre;
    private int numClientes;

    public Cine(String nombre, String localidad, int numClientes) {
        this.localidad = localidad;
        this.nombre = nombre;
        this.numClientes = numClientes;
    }

    public String getNombre() {
        return nombre;
    }
}
