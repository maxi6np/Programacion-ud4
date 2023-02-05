package Cine.src;

public class PeliculaInfantil extends Pelicula{


    private String productora;

    public PeliculaInfantil(String titulo, String anioEstreno, String[] horas) {
        super(titulo, anioEstreno, horas);
    }

    @Override
    public String toString(){
        return super.toString() + "\nProductora: " + productora;
    }

}
