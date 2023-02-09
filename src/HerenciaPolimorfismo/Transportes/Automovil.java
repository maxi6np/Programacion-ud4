package HerenciaPolimorfismo.Transportes;

public class Automovil extends Vehiculo{
    public Automovil(int numRuedas) {
        super(numRuedas);
    }

    public void encenderMotor(){
        System.out.println("Motor encendido");
    }

    @Override
    public String imprimible() {
        final StringBuilder sb = new StringBuilder("Automovil{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
