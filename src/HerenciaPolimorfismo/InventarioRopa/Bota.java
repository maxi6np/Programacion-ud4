package HerenciaPolimorfismo.InventarioRopa;

public class Bota extends Calzado{
    private boolean impermeable;

    public Bota(String codigo, String descripcion, double precio, int talla) {
        super(codigo, descripcion, precio, talla);
        this.impermeable = false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bota{");
        sb.append(super.toString());
        sb.append("impermeable=").append(impermeable);
        sb.append('}');
        return sb.toString();
    }
}
