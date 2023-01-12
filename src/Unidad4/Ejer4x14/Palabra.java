package Unidad4.Ejer4x14;

public class Palabra {
    private String palabraEspanol;
    private String palabraIngles;

    public Palabra(String palabraEspanol, String palabraIngles){
        this.palabraIngles = palabraIngles;
        this.palabraEspanol = palabraEspanol;
    }

    public String  getCastellano(){
        return palabraEspanol;
    }
    public String getIngles(){
        return palabraIngles;
    }

    public String toString(){
        return palabraEspanol + " - " + palabraIngles;
    }
}
