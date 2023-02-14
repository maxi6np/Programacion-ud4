package Academia;

import java.util.Objects;

public abstract class Curso{
    protected String nombre;
    protected double precio;
    protected int horasDuracion;

    public Curso(String nombre, double precio, int horasDuracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.horasDuracion = horasDuracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(int horasDuracion) {
        this.horasDuracion = horasDuracion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Curso{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", horasDuracion=").append(horasDuracion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Double.compare(curso.precio, precio) == 0 && horasDuracion == curso.horasDuracion && Objects.equals(nombre, curso.nombre);
    }

}
