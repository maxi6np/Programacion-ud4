package HerenciaPolimorfismo.InventarioRopa;

public class Pantalon extends Ropa{
    private String tipo;

    public Pantalon(String codigo, String descripcion, double precio, String talla,String tipo) {
        super(codigo, descripcion, precio, talla);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pantalon{");
        sb.append(super.toString());
        sb.append("tipo='").append(tipo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
