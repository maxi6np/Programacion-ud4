package HerenciaPolimorfismo.Figura;

import java.util.ArrayList;
import java.util.Objects;

public class Circulo extends Figura {
    private double radio;
    private final double PI = Math.PI;
    private Point centro;

    public Circulo(int x, int y,double radio) {
        super(x, y);
        centro = new Point(x,y);
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return PI * Math.pow(getRadio(), 2);
    }

    @Override
    public double perimetro() {
        return (2 * PI) * getRadio();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circulo circulo = (Circulo) obj;
        return Double.compare(circulo.radio, radio) == 0 && Double.compare(circulo.PI, PI) == 0;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circulo{");
        sb.append(super.toString());
        sb.append("radio=").append(radio);
        sb.append(", PI=").append(PI);
        sb.append(", area=").append(area());
        sb.append(", perimetro=").append(perimetro());
        sb.append('}');
        return sb.toString();
    }
}
