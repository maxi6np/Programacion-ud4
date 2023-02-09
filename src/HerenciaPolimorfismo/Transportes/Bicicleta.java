package HerenciaPolimorfismo.Transportes;

public class Bicicleta extends Vehiculo{
    public Bicicleta(int numRuedas) {
        super(numRuedas);
    }
    public void pedalear(){
        System.out.println("Pedaleando");
    }

    @Override
    public String imprimible() {
        final StringBuilder sb = new StringBuilder("Bicicleta{");
        sb.append('}');
        return sb.toString();
    }
}
