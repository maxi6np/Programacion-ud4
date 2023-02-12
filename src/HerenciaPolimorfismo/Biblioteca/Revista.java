package HerenciaPolimorfismo.Biblioteca;

public class Revista extends Elemento {
    private String nombre;
    private int numero;

    public Revista(int codigoNumerico, String nombre, int numero) {
        super(codigoNumerico);
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Revista{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", numero=").append(numero);
        sb.append(", codigoNumerico=").append(codigoNumerico);
        sb.append('}');
        return sb.toString();
    }
}
