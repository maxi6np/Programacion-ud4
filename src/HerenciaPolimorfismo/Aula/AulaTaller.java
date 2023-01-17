package HerenciaPolimorfismo.Aula;

public class AulaTaller extends Aula{
    public int num_pcs;

    public AulaTaller(String nombre, int num_pupitres, int num_pcs){
        super (nombre,num_pupitres);
        this.num_pcs = num_pcs;
    }

    public int getNum_pcs() {
        return num_pcs;
    }

    public void setNum_pcs(int num_pcs) {
        this.num_pcs = num_pcs;
    }

    public String visualizar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del aula: ").append(getNombre());
        sb.append("Numero de pupitres: ").append(getNum_pupitres());
        sb.append("Numero de ordenadores: ").append(getNum_pcs());
        return sb.toString();
    }
}
