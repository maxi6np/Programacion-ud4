package HerenciaPolimorfismo.Cuenta;

public class CuentaAhorro extends CuentaBancaria {

    public double interes;

    public CuentaAhorro(String nombre,double saldo, double interes){
        super(nombre, saldo);
        this.interes = interes;

    }

    public double obtenerInteres(){
        return saldo * interes;
    }


}
