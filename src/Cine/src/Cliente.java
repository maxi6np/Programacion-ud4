package Cine.src;

public class Cliente {


    public static final int CUOTA_JOVEN = 20;
    public static final int CUOTA_JUBILADO = 20;
    public static final int CUOTA_VIP = 30;
    public static final int NUMERO_ENTRADAS_VIP = 5;
    private String nombreApellidos;
    private String fechaNacimiento;
    private String DNI;
    private int tipo; // 0 -> joven | 1 -> jubilado | 2 -> VIP
    private int contadorVIP;

    public Cliente(String nombreApellidos, String fechaNacimiento, String DNI, int tipo) {
        this.nombreApellidos = nombreApellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        this.tipo = tipo;
        if (tipo == 2) {
            contadorVIP = 0;
        }
    }

    public void comprarEntrada() {
        StringBuilder sb = new StringBuilder();
        sb.append("El cliente ").append(getNombreApellidos());
        sb.append(" de tipo ").append(getTipo()).append(" ha comprado una entrada.");

        if (getTipo() == 2) { // si es VIP
            contadorVIP++;
            sb.append("\nLleva ").append(contadorVIP).append(" entradas.");
            if (contadorVIP < NUMERO_ENTRADAS_VIP) {
                sb.append("Le faltan ").append(NUMERO_ENTRADAS_VIP - contadorVIP).append(" para obtener una entrada gratis.");
            } else {
                contadorVIP = 0;
                sb.append("Felicidades, dispone de una entrada gratis.");
            }
        }

        System.out.println(sb.toString());
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public int getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreApellidos='" + nombreApellidos + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", DNI='" + DNI + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
