package HerenciaPolimorfismo.InventarioRopa;

public class Bota extends Calzado{

    private boolean impermeable;

    public Bota(String codigo, String descripcion, double precio, int talla, boolean impermeable) {
        super(codigo, descripcion, precio, talla);
        this.impermeable = impermeable;
    }

    public boolean isImpermeable() {
        return impermeable;
    }

    @Override
    public boolean equals(Prenda p1) {
        if(!super.equals(p1)) return false;

        if (p1 instanceof Bota){
            return ((Bota) p1).isImpermeable() == this.impermeable;
        }

        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bota ");
        sb.append(super.toString());
        sb.append("\n Impermeable: ");
        if(impermeable)sb.append("Impermeable"); else sb.append(" No impermeable");
        sb.append("\n-------------------------------------------------");
        return sb.toString();
    }
}
