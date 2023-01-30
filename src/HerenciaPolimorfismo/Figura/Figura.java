package HerenciaPolimorfismo.Figura;

import java.awt.*;
import java.util.ArrayList;

public abstract class Figura extends GestorFiguras{
    private Point centro;
    private Color color;

    public Figura(int x, int y, ArrayList listaFiguras) {
        super(listaFiguras);
        centro = new Point(x,y);
    }


    public Point getCentro() {
        return centro;
    }

    public void setCentro(Point centro) {
        this.centro = centro;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimetro();
    public abstract boolean equals(Object obj);


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Figura{");
        sb.append("centro=").append(centro);
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
}
