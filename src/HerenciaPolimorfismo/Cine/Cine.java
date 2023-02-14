package HerenciaPolimorfismo.Cine;

import java.util.Scanner;

public class Cine {
    private String localidad;
    private String nombre;
    private Clientes[] numClientes;
    private Peliculas[] peliculas;
    private int entradasJovenes;
    private int entradasJubilados;
    private int entradasVIP;

    public Cine(String localidad, String nombre) {
        this.localidad = localidad;
        this.nombre = nombre;
        numClientes = new Clientes[100];
        peliculas = new Peliculas[5];
        entradasJovenes = 0;
        entradasJubilados = 0;
        entradasVIP = 0;
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


    public boolean anadirPelicula(Peliculas peli) {
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] == null) {
                peliculas[i] = peli;
                return true;
            }
        }
        return false;
    }

    public boolean borrarPelicula(String titulo, int anioEstreno) {
        Peliculas p = new Peliculas(titulo, anioEstreno);
        for (int i = 0; i < peliculas.length; i++) {
            if (p.equals(peliculas[i])) {
                peliculas[i] = null;
                return true;
            }
        }
        return false;
    }

    public void mostrarPeliculas(){
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println(peliculas[i]);
        }
    }
    public void mostrarClientes(){
        for (int i = 0; i < numClientes.length; i++) {
            System.out.println(numClientes[i]);
        }
    }


    public boolean anadirCliente(Clientes cliente) {
        for (int i = 0; i < numClientes.length; i++) {
            if (cliente.equals(numClientes[i])) {
                numClientes[i] = null;
                if(cliente instanceof ClienteJubilado){
                    entradasJubilados++;
                }else if(cliente instanceof ClienteVIP){
                    entradasVIP++;
                }else if(cliente instanceof ClienteJoven){
                    entradasJovenes++;
                }
                return true;
            }
        }
        return false;
    }

    public void comprarEntrada(Peliculas peli, Clientes cliente) {
        peli.setEntradasVendidas(peli.getEntrada() + 1);
        cliente.comprarEntrada(peli);
    }


    public void cambiarDatos(String nombre, String localidad) {
        this.localidad = localidad;
        this.nombre = nombre;
    }
    public void cambiarDatos(String localidad) {
        cambiarDatos(localidad,localidad);
    }
}
