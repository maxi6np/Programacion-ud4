package HerenciaPolimorfismo.Biblioteca;

import java.util.Date;

public class Periodico extends Elemento {
    private String nombre;
    private String fechaPublicacion;

    public Periodico(int codigoNumerico, String nombre, String fechaPublicacion) {
        super(codigoNumerico);
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Periodico{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", fechaPublicacion=").append(fechaPublicacion);
        sb.append(", codigoNumerico=").append(codigoNumerico);
        sb.append('}');
        return sb.toString();
    }
}
