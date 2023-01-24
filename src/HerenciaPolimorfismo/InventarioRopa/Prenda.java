package HerenciaPolimorfismo.InventarioRopa;

public class Prenda {
    private String codigo;
    private String descripcion;
    private double precio;

    public Prenda(String codigo, String descripcion, double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Prenda{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
