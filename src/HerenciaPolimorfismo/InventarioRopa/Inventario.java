package HerenciaPolimorfismo.InventarioRopa;

public class Inventario {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarPrenda("gorra");
        inventario.agregarPrenda("camiseta");
        inventario.agregarPrenda("mocasines");
        inventario.agregarPrenda("abrigo");
        inventario.agregarPrenda("calzoncillo");
        inventario.agregarPrenda("tanga");;
        inventario.agregarPrenda("tirantes");
        inventario.agregarPrenda("americana");
        inventario.agregarPrenda("chaqueta");
        inventario.agregarPrenda("pantalones de pana");
        inventario.agregarPrenda("calceteines");
        inventario.mostrarInventario();
    }

    private String[] prendas;
    private int limite;
    public static final int MAX_PRENDAS = 10;

    public Inventario() {
        prendas = new String[MAX_PRENDAS];
        limite = 0;
    }

    public boolean inventarioCompleto() {
        return limite == prendas.length;
    }

    public void agregarPrenda(String nuevaPrenda) {
        if (!inventarioCompleto()) {
            prendas[limite] = nuevaPrenda;
            limite++;
        }
    }

    public void mostrarInventario() {
        System.out.println("INVENTARIO");
        for (int i = 1; i <= limite; i++) {
            System.out.println("Prenda nº" + i + ": " + prendas[i - 1]);
        }
        if (inventarioCompleto()){
            System.out.println("Inventario completo");
        }
    }
}
