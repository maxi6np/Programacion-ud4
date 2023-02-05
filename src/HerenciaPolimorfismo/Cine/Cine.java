package HerenciaPolimorfismo.Cine;

import java.util.ArrayList;

public class Cine {
    private String localidad;
    private String nombre;
    private ArrayList<Clientes> numClientes;
    private int entradasJovenes;
    private int entradasJubilados;
    private int entradasVIP;

    public Cine(String nombre, String localidad) {
        this.localidad = localidad;
        this.nombre = nombre;
        numClientes = new ArrayList<>();
    }

    public void anadirCliente(Clientes cliente){
        numClientes.add(cliente);
        switch (cliente.getTipoCliente()) {
            case "joven" -> entradasJovenes++;
            case "jubilado" -> entradasJubilados++;
            case "VIP" -> entradasVIP++;
        }
    }

    public String getLocalidad() {
        return localidad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEntradasJovenes() {
        return entradasJovenes;
    }
    public int getEntradasJubilados() {
        return entradasJubilados;
    }
    public int getEntradasVIP() {
        return entradasVIP;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cine{");
        sb.append("localidad='").append(localidad).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", entradasJovenes=").append(entradasJovenes);
        sb.append(", entradasJubilados=").append(entradasJubilados);
        sb.append(", entradasVIP=").append(entradasVIP);
        sb.append('}');
        return sb.toString();
    }
}
