package HerenciaPolimorfismo.Cuenta;

public class CuentaCorriente extends CuentaBancaria {

    private double importe_minimo;
    private double recargo;

    public CuentaCorriente(String nombre,double saldo, double importe_minimo){
        super(nombre, saldo);
        this.importe_minimo = importe_minimo;
        this.recargo = 0;

    }
    public double obtenerRecargo(){
        if (saldo < importe_minimo){
            recargo = (importe_minimo - saldo) * 0.1;
        }
        return recargo;
    }
}
