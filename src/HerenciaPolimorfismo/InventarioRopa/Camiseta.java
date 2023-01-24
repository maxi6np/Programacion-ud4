package HerenciaPolimorfismo.InventarioRopa;

public class Camiseta extends Ropa{

    public Camiseta(String codigo, String descripcion, double precio, String talla) {
        super(codigo, descripcion, precio, talla);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camiseta{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
