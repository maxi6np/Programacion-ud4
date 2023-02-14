package Academia;

public class CursoMixto extends Curso implements Subvencionable{
    public int horasTeoria;
    public int horasPractica;

    public CursoMixto(String nombre, double precio, int horasDuracion, int horasPractica, int horasTeoria) {
        super(nombre, precio, horasDuracion);
        this.horasPractica = horasPractica;
        this.horasTeoria = horasTeoria;
    }

    public int getHorasTeoria() {
        return horasTeoria;
    }

    public void setHorasTeoria(int horasTeoria) {
        this.horasTeoria = horasTeoria;
    }

    public int getHorasPractica() {
        return horasPractica;
    }

    public void setHorasPractica(int horasPractica) {
        this.horasPractica = horasPractica;
    }

    @Override
    public double getPrecioSubvencionado() {
        return precio * 0.75;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CursoMixto{");
        sb.append(super.toString());
        sb.append("horasTeoria=").append(horasTeoria);
        sb.append(", horasPractica=").append(horasPractica);
        sb.append('}');
        return sb.toString();
    }
}

