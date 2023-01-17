package Arrays.Ejer4x14;

public class Palabra {

    private String es;
    private String en;

    public Palabra(String es, String en) {
        this.es = es;
        this.en = en;
    }

    public String getEs() {
        return es;
    }

    public String getEn() {
        return en;
    }

    @Override
    public String toString(){
        return getEs() + " - " + getEn();
    }
}
