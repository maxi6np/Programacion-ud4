package HerenciaPolimorfismo.Cine;

public class Clientes{
    private String nombreApellidos;
    private String fechaNacimiento;
    private String DNI;
    private String tipoCliente;
    private int entradasCompradas;
    private final int PRECIO_JOVEN = 20;
    private final int PRECIO_JUBILADO = 20;
    private final int PRECIO_VIP = 30;

    public Clientes(String nombreApellidos, String fechaNacimiento, String DNI, String tipoCliente) {
        this.nombreApellidos = nombreApellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.tipoCliente = tipoCliente;
        this.entradasCompradas = 0;
    }

    public void comprarEntrada() {
        entradasCompradas++;
        System.out.println("El cliente " + nombreApellidos + " de tipo " + tipoCliente + " ha comprado una entrada.");
    }

    private void entradaGratis() {
        if (tipoCliente.equals("VIP") && entradasCompradas % 5 == 0) {
            System.out.println("El cliente " + nombreApellidos + " (VIP) ha recibido una entrada gratuita.");
        }
    }

    public int calcularCuotaAnual(){
        int cuotaAnual = 0;
        switch (tipoCliente){
            case "joven" -> cuotaAnual = PRECIO_JOVEN;
            case "jubilado" -> cuotaAnual = PRECIO_JUBILADO;
            case "VIP" -> cuotaAnual = PRECIO_VIP;
        }
        return cuotaAnual;
    }

}
