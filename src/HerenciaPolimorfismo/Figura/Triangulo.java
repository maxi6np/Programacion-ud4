package HerenciaPolimorfismo.Figura;

import java.util.ArrayList;
import java.util.Objects;

public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double base;

    public Triangulo(int x, int y, ArrayList listaFiguras, double lado1, double lado2, double base) {
        super(x, y, listaFiguras);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
    }


    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        double sp = (lado1 + lado2 + base) / 2; //semiperimetro
        return (Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - base)));//formula de herón
    }

    @Override
    public double perimetro() {
        return getLado1() + getLado2() + getBase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return Double.compare(triangulo.lado1, lado1) == 0 && Double.compare(triangulo.lado2, lado2) == 0 && Double.compare(triangulo.base, base) == 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Triangulo{");
        sb.append(super.toString());
        sb.append("lado1=").append(lado1);
        sb.append(", lado2=").append(lado2);
        sb.append(", base=").append(base);
        sb.append(", perimetro=").append(perimetro());
        sb.append(", area=").append(area());
        sb.append('}');
        return sb.toString();
    }
}
