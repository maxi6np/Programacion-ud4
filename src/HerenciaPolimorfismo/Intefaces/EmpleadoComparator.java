package HerenciaPolimorfismo.Intefaces;

import java.util.Comparator;

public class EmpleadoComparator extends Empleado implements Comparator<Empleado> {


    public EmpleadoComparator(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario, departamento);
    }

    @Override
    public int compare(Empleado o1, Empleado o2) {
        if (o1.getSalario() > o2.getSalario()){
            return 1;
        }
        if (o1.getSalario() < o2.getSalario()){
            return -1;
        }
        return 0;
    }
}
