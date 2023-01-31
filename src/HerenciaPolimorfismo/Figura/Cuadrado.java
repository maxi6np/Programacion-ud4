package HerenciaPolimorfismo.Figura;

import java.util.ArrayList;
import java.util.Objects;

public class Cuadrado extends Figura{
    private double lado;
    private Point centro;

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        centro = new Point(x,y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.pow(getLado(),2);
    }

    @Override
    public double perimetro() {
        return getLado() * 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuadrado cuadrado = (Cuadrado) o;
        return Double.compare(cuadrado.lado, lado) == 0;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuadrado{");
        sb.append(super.toString());
        sb.append("lado=").append(lado);
        sb.append(", perimetro=").append(perimetro());
        sb.append(", area=").append(area());
        sb.append('}');
        return sb.toString();
    }
}
