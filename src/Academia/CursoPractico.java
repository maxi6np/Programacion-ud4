package Academia;

public class CursoPractico extends Curso implements Subvencionable{
    public String sede;

    public CursoPractico(String nombre, double precio, int horasDuracion, String sede) {
        super(nombre, precio, horasDuracion);
        this.sede = sede;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public double getPrecioSubvencionado() {
        return precio * 0.5;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CursoPractico{");
        sb.append(super.toString());
        sb.append("sede='").append(sede).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
