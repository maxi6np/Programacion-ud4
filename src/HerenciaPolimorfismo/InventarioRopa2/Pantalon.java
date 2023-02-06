package HerenciaPolimorfismo.InventarioRopa2;

public class Pantalon extends Ropa{

    private String tipo;

    public Pantalon(String codigo, String descripcion, double precio, String talla, String tipo) {
        super(codigo, descripcion, precio, talla);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Prenda p1) {
        if (!super.equals(p1)) return false;
        if (p1 instanceof Pantalon){
            return ((Pantalon) p1).getTipo().equals(this.tipo);
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pantalon ");
        sb.append(super.toString());
        sb.append("\n Tipo: ").append(tipo);
        sb.append("\n-------------------------------------------------");
        return sb.toString();
    }
}
