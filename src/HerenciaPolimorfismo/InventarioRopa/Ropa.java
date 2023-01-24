package HerenciaPolimorfismo.InventarioRopa;

public class Ropa extends Prenda{
    private String talla;

    public Ropa(String codigo, String descripcion, double precio, String talla) {
        super(codigo, descripcion, precio);
        this.talla = talla;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ropa{");
        sb.append(super.toString());
        sb.append("talla='").append(talla).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
