package HerenciaPolimorfismo.InventarioRopa;

public abstract class Prenda {

    private String codigo;

    private String descripcion;

    private double precio;

    public Prenda(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean equals(Prenda p1){

        if (!(p1 instanceof Prenda)) return false;

        return p1.getCodigo().equals(this.codigo) && p1.getDescripcion().equals(this.descripcion) && p1.getPrecio() == this.precio;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\nCódigo: ").append(codigo);
        sb.append("\nDescripcion: ").append(descripcion);
        sb.append("\nPrecio: ").append(precio);
        return sb.toString();
    }
}
