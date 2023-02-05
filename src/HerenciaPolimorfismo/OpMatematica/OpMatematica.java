package HerenciaPolimorfismo.OpMatematica;

public interface OpMatematica {
    int calcular (int a, int b);
    default int sumar (int a, int b){
        return a + b;
    }
}
