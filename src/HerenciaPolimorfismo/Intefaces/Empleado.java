package HerenciaPolimorfismo.Intefaces;

import HerenciaPolimorfismo.Animales.Persona;

public class Empleado extends Persona implements Comparable <Empleado>{
    private double salario;
    private String departamento;

    public Empleado(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad);
        this.salario = salario;
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public int compareTo(Empleado o) {
        if(this.getEdad() == o.getEdad()){
            return 0;
        }
        if(this.getEdad() < o.getEdad()){
            return -1;
        }
        return 1;
    }
}
