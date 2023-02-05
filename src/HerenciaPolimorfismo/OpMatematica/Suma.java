package HerenciaPolimorfismo.OpMatematica;

public class Suma implements OpMatematica{
    @Override
    public int calcular(int a, int b) {
        return sumar(a,b);
    }
}
