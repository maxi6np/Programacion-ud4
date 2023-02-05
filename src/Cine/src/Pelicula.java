package Cine.src;

public class Pelicula {

    private String titulo;
    private String anioEstreno;
    private int entradasVendidas;
    private String[] horas;

    public Pelicula(String titulo, String anioEstreno, String[] horas){
        this.titulo = titulo;
        this.anioEstreno = anioEstreno;
        this.entradasVendidas = 0;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnioEstreno() {
        return anioEstreno;
    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }

    public void reservarEntrada(){
        entradasVendidas++;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Título: ").append(titulo);
        sb.append("\nAño de estreno: ").append(anioEstreno);
        sb.append("\nEntradas vendidas: ").append(entradasVendidas);
        sb.append("\nHorarios:\n");
        for (String s : horas){
            sb.append("\t").append(s);
        }
        return sb.toString();
    }
}
