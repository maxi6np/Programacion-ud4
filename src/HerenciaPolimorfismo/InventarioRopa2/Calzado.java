package HerenciaPolimorfismo.InventarioRopa2;

import java.awt.*;

public abstract class Calzado extends Prenda {

    private int talla;

    private Point punto;

    public Calzado(String codigo, String descripcion, double precio, int talla) {
        super(codigo, descripcion, precio);
        this.talla = talla;
    }

    public int getTalla() {
        return talla;
    }


    @Override
    public boolean equals(Prenda p1) {
        if (!(super.equals(p1))) return false;
        if (!(p1 instanceof Calzado)){
            return false;
        }
        return ((Calzado) p1).getTalla() == this.talla;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n Talla: ").append(talla);
        return sb.toString();
    }
}
