package HerenciaPolimorfismo.Figura;

import java.awt.*;
import java.util.ArrayList;

public class GestorFiguras {
    private ArrayList<Figura> listaFiguras;
    private Circulo circulo;
    private Cuadrado cuadrado;
    private Triangulo triangulo;


    public GestorFiguras(ArrayList listaFiguras) {
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

    public Figura mayorArea(){
        if (circulo.area() > triangulo.area()){
            return circulo;
        } else if (cuadrado.area() > triangulo.area()) {
            return cuadrado;
        } else{
            return triangulo;
        }
    }

    public void borrarDeColor(Color color){
        for (Figura f : listaFiguras){
            if (f.getColor().equals(color)){
                listaFiguras.remove(f);
            }
        }

    }

    public void borrarIgualesA(Figura figura){
        if (figura != null){
            for (Figura fig : listaFiguras){
                if (figura.equals(fig)){
                    listaFiguras.remove(figura);
                }
            }
        }


    }
}
