package HerenciaPolimorfismo.Cuenta;

public class CuentaBancaria {

    public String nombreCliente;
    public double saldo;

    public CuentaBancaria(String nombre, double saldo){
        this.nombreCliente = nombre;
        this.saldo = saldo;
    }

    public String getNombreCliente(){
        return nombreCliente;
    }

    public double getimporte(){
        return saldo;
    }

    public void ingresar(double cantidadIngresar){
        if (cantidadIngresar > 0){
            saldo += cantidadIngresar;
        }

    }

    public void reintegrar(double cantidadRetirar){
        if (cantidadRetirar <= saldo){
            saldo -= cantidadRetirar;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuentaBancaria{");
        sb.append("nombreCliente='").append(nombreCliente).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }
}
