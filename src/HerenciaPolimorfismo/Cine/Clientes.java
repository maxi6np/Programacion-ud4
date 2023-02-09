package HerenciaPolimorfismo.Cine;

import java.util.Date;
import java.util.Objects;

public abstract class Clientes{
    private String nombreApellidos;
    private Date fechaNacimiento;
    private String DNI;
    private int entradasCompradas;
    private double precioCuota;

    public Clientes(String nombreApellidos, Date fechaNacimiento, double precioCuota, String DNI) {
        this.nombreApellidos = nombreApellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.precioCuota = precioCuota;
    }
    public abstract void comprarEntrada(Peliculas pelicula);
    public String getTextoComprarEntrada(String tipoCliente){
        return "El cliente " + getNombreApellidos() + " de tipo  " + tipoCliente +" ha comprado una entrada.";
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getDNI() {return DNI;}
    public int getEntradasCompradas() {return entradasCompradas;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clientes{");
        sb.append("nombreApellidos='").append(nombreApellidos).append('\'');
        sb.append(", fechaNacimiento='").append(fechaNacimiento).append('\'');
        sb.append(", DNI='").append(DNI).append('\'');
        sb.append(", precioCuota='").append(precioCuota).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clientes clientes = (Clientes) o;
        return nombreApellidos.equals(clientes.nombreApellidos) && DNI.equals(clientes.DNI);
    }
}
