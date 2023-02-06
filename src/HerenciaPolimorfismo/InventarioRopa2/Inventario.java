package HerenciaPolimorfismo.InventarioRopa2;

public class Inventario {

    private Prenda[] prendas;

    private int posicion;

    public Inventario() {
        prendas = new Prenda[10];
        posicion = 0;
    }

    public void agregarPrenda(Prenda quePrenda) {
        prendas[posicion] = quePrenda;
        posicion++;

        if (quePrenda instanceof Camiseta) {
            System.out.println("Se ha añadido una camiseta");
        }
    }

    public void mostrarInventario() {
        for (Prenda p : prendas) {
            System.out.println(p);
        }
    }

    public void comparador(Prenda p1, Prenda p2) {

        if (p1.equals(p2)) {
            System.out.println(1);
        } else if (p1.getClass() == p2.getClass()) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }

    }


}
