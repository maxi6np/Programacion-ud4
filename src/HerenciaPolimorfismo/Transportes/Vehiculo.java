package HerenciaPolimorfismo.Transportes;

public abstract class Vehiculo implements Transporte,Imprimible{
    private int numRuedas;

    public Vehiculo(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public void moverse(int desp) {
        if(desp > 0){
            System.out.println("Se mueve hacia delante");
        } else if (desp == 0){
            System.out.println("No se mueve");
        }else{
            System.out.println("Se mueve hacia atrás");
        }
    }
}
