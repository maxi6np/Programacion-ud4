package HerenciaPolimorfismo.InventarioRopa;

public class Inventario {
    static Prenda top = new Camiseta("435", "top corto blanco", 34.34, "L");
    static Prenda falda = new Pantalon("0467850", "falda larga roja granada", 20.99, "L","vaquera");
    static Prenda pantalonCorto = new Pantalon("111", "pantalon corto vaquero", 12.23, "L","chinos");
    static Prenda tirantes = new Camiseta("33", "camiseta tirantes blanca basic", 5.55, "L");
    static Prenda sandalias = new Zapatilla("3454", "sandalias estampado bandera de brasil", 9.99, 39);
    static Prenda airMax = new Zapatilla("098234", "air Max con doble plantilla negras", 120.35, 44);
    static Prenda botas = new Bota("23452", "botas impermeables negras", 70.00, 40);

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarPrenda(top);
        inventario.agregarPrenda(falda);
        inventario.agregarPrenda(sandalias);
        inventario.agregarPrenda(tirantes);
        inventario.agregarPrenda(pantalonCorto);
        inventario.agregarPrenda(airMax);
        inventario.agregarPrenda(botas);
        inventario.mostrarInventario();
        inventario.comparador(botas,top);
    }

    private Prenda[] prendas;
    private int limite;
    public static final int MAX_PRENDAS = 10;

    public Inventario() {
        prendas = new Prenda[MAX_PRENDAS];
        limite = 0;
    }

    private boolean inventarioCompleto() {
        return limite == prendas.length;
    }

    public void agregarPrenda(Prenda nuevaPrenda) {
        if (!inventarioCompleto()) {
            prendas[limite] = nuevaPrenda;
            limite++;
            System.out.println(nuevaPrenda.anadirMensaje());

        }
    }

    public void mostrarInventario() {
        System.out.println("INVENTARIO");
        for (int i = 1; i <= limite; i++) {
            System.out.println("Prenda nº" + i + ": " + prendas[i - 1]);
        }
        if (inventarioCompleto()) {
            System.out.println("Inventario completo");
        }
    }

    public int comparador(Prenda prenda1, Prenda prenda2) {
        if (prenda1.getClass().equals(prenda2.getClass())) {
            if (prenda1.getAtributos().equals(prenda2.getAtributos())) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }
}
