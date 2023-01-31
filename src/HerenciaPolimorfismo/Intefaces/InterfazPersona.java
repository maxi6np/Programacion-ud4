package HerenciaPolimorfismo.Intefaces;

public class InterfazPersona implements Cloneable{
    private int edad;
    private String nombre;
    private String direccion;

    public InterfazPersona(int edad, String nombre, String direccion) {
        this.edad = edad;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try{
            return super.clone();
        }
        catch (CloneNotSupportedException e){
            return null;
        }
    }
}
