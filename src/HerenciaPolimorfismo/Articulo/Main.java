package HerenciaPolimorfismo.Articulo;

public class Main {
    public static void main(String[] args) {
        BaseDatos base2 = new BaseDatos();
        CD estopa = new CD("camaron",154,"estopa",true,"la mitica",12);
        CD melendi = new CD("camaron",154,"estopa",false,"dicen que es buena",2);
        DVD mulan = new DVD("camaron",154,true,"nostalgia de mi niñez","director chino");
        DVD buzzlightyear = new DVD("camaron",154,false,"nada que añadir","director influenciado por los complejos de las sociedad");

        base2.addArticulo(estopa);
        base2.addArticulo(melendi);
        base2.addArticulo(mulan);
        base2.addArticulo(buzzlightyear);

        base2.listar();

    }
}
