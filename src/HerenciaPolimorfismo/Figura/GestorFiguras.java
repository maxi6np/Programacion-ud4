package HerenciaPolimorfismo.Figura;

import java.awt.*;
import java.util.ArrayList;

public class GestorFiguras {
    private ArrayList<Figura> listaFiguras;
    private Circulo circulo;
    private Cuadrado cuadrado;
    private Triangulo triangulo;


    public GestorFiguras() {
        this.listaFiguras = listaFiguras;
    }

    public void addFigura(Figura F) {
        listaFiguras.add(F);
    }

    public void listarFiguras() {
        for (Figura F : listaFiguras) {
            System.out.println(F);
        }
    }

    public Figura mayorArea() {
        if (circulo.area() > triangulo.area()) {
            return circulo;
        } else if (cuadrado.area() > triangulo.area()) {
            return cuadrado;
        } else {
            return triangulo;
        }
    }

    public void borrarDeColor(Color color) {
        for (Figura f : listaFiguras) {
            if (f.getColor().equals(color)) {
                listaFiguras.remove(f);
            }
        }

    }

    public void borrarIgualesA(Figura figura) {
        if (figura != null) {
            for (Figura fig : listaFiguras) {
                if (figura.equals(fig)) {
                    listaFiguras.remove(figura);
                }
            }
        }
    }

    public void testMovibles() {
        ArrayList<Movible> movibles = new ArrayList<>();
        Movible circulo = new Circulo(2,2,10);
        Movible t = new Triangulo(2,2,5,4,7);
        Movible cuadrado = new Cuadrado(2,2,6);

        movibles.add(circulo);
        movibles.add(t);
        movibles.add(cuadrado);

        for (Movible mov : movibles) {
            System.out.println(mov);
        }


        circulo.moverHorizontal(-90);
        circulo.moverHorizontal(-9);
        circulo.moverHorizontal(16);
        circulo.moverVertical(54);
        circulo.moverVertical(-53);
        circulo.moverVertical(12);

        System.out.println("Modificando...");
        for (Movible mov : movibles) {
            System.out.println(mov);
        }

    }
}
