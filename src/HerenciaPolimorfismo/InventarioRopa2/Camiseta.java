package HerenciaPolimorfismo.InventarioRopa2;

public class Camiseta extends Ropa{

    public Camiseta(String codigo, String descripcion, double precio, String talla) {
        super(codigo, descripcion, precio, talla);
    }

    @Override
    public boolean equals(Prenda p1) {
        if (!super.equals(p1)) return false;

        if (p1 instanceof Camiseta){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camiseta ");
        sb.append(super.toString());
        sb.append("\n-------------------------------------------------");
        return sb.toString();
    }
}
