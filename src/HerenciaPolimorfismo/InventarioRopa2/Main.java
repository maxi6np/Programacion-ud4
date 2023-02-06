package HerenciaPolimorfismo.InventarioRopa2;

public class Main {
    public static void main(String[] args) {

        Inventario I1 = new Inventario();

        Prenda cami1 = new Camiseta("C1", "camiseta blanca", 20, "M");
        Prenda cami3 = new Camiseta("C1", "camiseta blanca", 20, "S");
        Prenda cami2 = new Camiseta("C2", "camiseta roja", 20, "M");
        Prenda pant1 = new Pantalon("P1", "Pantalón largo", 35, "42", "Invierno");
        Prenda pant2 = new Pantalon("P2", "Pantalón corto", 15, "38", "Verano");
        Prenda bota1 = new Bota("B1", "Bota de invierno", 60, 44, true);
        Prenda bota2 = new Bota("B2", "Bota de primavera", 40, 43, false);
        Prenda zapa1 = new Zapatilla("Z1", "Zapatillas de deporte", 40, 43);
        Prenda zapa2 = new Zapatilla("Z2", "Zapatilals de paseo", 35, 42);

        I1.agregarPrenda(cami1);
        I1.agregarPrenda(cami2);
        I1.agregarPrenda(pant1);
        I1.agregarPrenda(pant2);
        I1.agregarPrenda(bota1);
        I1.agregarPrenda(bota2);
        I1.agregarPrenda(zapa1);
        I1.agregarPrenda(zapa2);

        I1.mostrarInventario();

        I1.comparador(cami1, cami2);

        I1.comparador(cami1, cami3);

        I1.comparador(cami1, bota1);

    }
}