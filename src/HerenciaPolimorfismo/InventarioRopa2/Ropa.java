package HerenciaPolimorfismo.InventarioRopa2;

public  abstract class Ropa extends Prenda{

    private String talla;

    public Ropa(String codigo, String descripcion, double precio, String talla) {
        super(codigo, descripcion, precio);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    @Override
    public boolean equals(Prenda p1) {
        if (!(super.equals(p1))) return false;
        if (!(p1 instanceof Ropa)){
            return false;
        }
        return ((Ropa) p1).getTalla().equals(this.talla);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nTalla: ").append(talla);
        return sb.toString();
    }
}
