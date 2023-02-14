package HerenciaPolimorfismo.InventarioRopa;

public class Zapatilla extends Calzado{

    public Zapatilla(String codigo, String descripcion, double precio, int talla) {
        super(codigo, descripcion, precio, talla);
    }

    @Override
    public boolean equals(Prenda p1) {
        if (!super.equals(p1)) return false;
        if (p1 instanceof Zapatilla){
            return true;
        }
       return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zapatilla ");
        sb.append(super.toString());
        sb.append("\n-------------------------------------------------");
        return sb.toString();
    }
}
