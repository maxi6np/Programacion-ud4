package HerenciaPolimorfismo.InventarioRopa;

public class Zapatilla extends Calzado{
    public Zapatilla(String codigo, String descripcion, double precio, int talla) {
        super(codigo, descripcion, precio, talla);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zapatilla{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
