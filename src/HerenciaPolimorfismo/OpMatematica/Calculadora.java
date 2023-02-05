package HerenciaPolimorfismo.OpMatematica;

public class Calculadora {
    public static void main(String[] args) {
        Suma suma = new Suma();
        Multiplicacion multi = new Multiplicacion();
        System.out.println(realizarOperacion(suma,5,4));
        System.out.println(realizarOperacion(multi,3,4));

    }
    public static int realizarOperacion(OpMatematica op, int a, int b){
        return op.calcular(a,b);
    }
}
