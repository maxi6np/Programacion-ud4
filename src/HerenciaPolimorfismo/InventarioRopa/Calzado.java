package HerenciaPolimorfismo.InventarioRopa;

public class Calzado extends Prenda{
    private int talla;

    public Calzado(String codigo, String descripcion, double precio, int talla) {
        super(codigo, descripcion, precio);
        this.talla = talla;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calzado{");
        sb.append(super.toString());
        sb.append("talla=").append(talla);
        sb.append('}');
        return sb.toString();
    }
}
