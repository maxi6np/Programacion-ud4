package HerenciaPolimorfismo.Cuenta;

public class Main {
    public static void main(String[] args) {
        CuentaAhorro miCuenta = new CuentaAhorro("Maximo", 1500,0.021);
        miCuenta.ingresar(600);
        miCuenta.reintegrar(135.67);
        double interes = miCuenta.obtenerInteres();
        System.out.println(miCuenta);
        System.out.println("Interes generado: " + interes + " euros");
    }
}
