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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String anadirMensaje(){
        return "";
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


    public Object getAtributos() {
        return codigo + descripcion + precio;
    }
}
