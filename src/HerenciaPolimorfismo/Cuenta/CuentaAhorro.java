package HerenciaPolimorfismo.Cuenta;

public class CuentaAhorro extends CuentaBancaria {
    public static void main(String[] args) {
        CuentaAhorro ca = new CuentaAhorro("ma",34.4,5);
        ca.clase();
    }

    public double interes;

    public CuentaAhorro(String nombre,double saldo, double interes){
        super(nombre, saldo);
        this.interes = interes;

    }

    public double obtenerInteres(){
        return saldo * interes;
    }
    public void clase(){
        System.out.println("Este objeto pertenece a la clase: " + this.getClass().getSimpleName());
    }


}
