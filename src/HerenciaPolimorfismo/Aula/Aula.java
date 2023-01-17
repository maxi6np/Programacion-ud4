package HerenciaPolimorfismo.Aula;

public class Aula {
    public int num_pupitres;
    public String nombre;

    public Aula(String nombre, int num_pupitres){
        this.nombre = nombre;
        this.num_pupitres = num_pupitres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_pupitres() {
        return num_pupitres;
    }

    public void setNum_pupitres(int num_pupitres) {
        this.num_pupitres = num_pupitres;
    }

    public String mostrar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del aula: ").append(getNombre());
        sb.append("Numero de pupitres: ").append(getNum_pupitres());
        return sb.toString();
    }


}
