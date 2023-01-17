package HerenciaPolimorfismo.Articulo;

import java.util.ArrayList;

public class BaseDatos {
    private ArrayList<Articulo> articulos;

    //construir una base de datos vacia
    public BaseDatos(){
        articulos = new ArrayList<Articulo>();
    }

    //añadir articulo a la base de datos

    public void addArticulo(Articulo elArticulo){
        articulos.add(elArticulo);
    }

    public void listar(){
        for (Articulo a : articulos){
            System.out.println(a);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseDatos{");
        sb.append(super.toString());
        sb.append("articulos=").append(articulos);
        sb.append('}');
        return sb.toString();
    }
}


