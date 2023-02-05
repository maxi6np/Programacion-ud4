package HerenciaPolimorfismo.Cine;

import java.util.Objects;

public class Clientes{
    private String nombreApellidos;
    private String fechaNacimiento;
    private String DNI;
    private String tipoCliente;
    private int entradasCompradas;
    private final static int NUMERO_ENTRADAS_VIP = 5;
    private int contadorVIP;
    private final static int PRECIO_JOVEN = 20;
    private final static int PRECIO_JUBILADO = 20;
    private final static int PRECIO_VIP = 30;

    public Clientes(String nombreApellidos, String fechaNacimiento, String DNI, String tipoCliente) {
        this.nombreApellidos = nombreApellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.tipoCliente = tipoCliente;
        this.entradasCompradas = 0;
        if (tipoCliente.equals("VIP")){
            contadorVIP = 0;
        }
    }

    public void comprarEntrada() {
        entradasCompradas++;
        System.out.println("El cliente " + nombreApellidos + " de tipo " + tipoCliente + " ha comprado una entrada.");
        if (tipoCliente.equals("VIP")) {
            contadorVIP++;
            if (contadorVIP < NUMERO_ENTRADAS_VIP){
                System.out.println("Le falta " + (NUMERO_ENTRADAS_VIP - contadorVIP) + " para conseguir una entrada gratuita.");
            }else{
                System.out.println("Felicidades " + nombreApellidos + " (VIP) has recibido una entrada gratuita");
            }
        }
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getDNI() {return DNI;}
    public String getTipoCliente() {return tipoCliente;}
    public int getEntradasCompradas() {return entradasCompradas;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clientes{");
        sb.append("nombreApellidos='").append(nombreApellidos).append('\'');
        sb.append(", fechaNacimiento='").append(fechaNacimiento).append('\'');
        sb.append(", DNI='").append(DNI).append('\'');
        sb.append(", tipoCliente='").append(tipoCliente).append('\'');
        sb.append(", entradasCompradas=").append(entradasCompradas);
        sb.append('}');
        return sb.toString();
    }
}
