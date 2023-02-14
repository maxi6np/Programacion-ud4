package CineMalva.src;

public class Cine {


    private static final int NUMERO_PELICULAS = 5;
    private static final int NUMERO_CLIENTES = 10;
    private String localidad;
    private String nombre;
    private Pelicula[] peliculas;
    private int indexPeliculas;
    private Cliente[] clientes;
    private int indexClientes;
    private int contJoven;
    private int contJubilado;
    private int contVIP;

    public Cine(String localidad, String nombre) {
        this.peliculas = new Pelicula[NUMERO_PELICULAS];
        this.clientes = new Cliente[NUMERO_CLIENTES];
        this.localidad = localidad;
        this.nombre = nombre;
        this.contJoven = 0;
        this.contJubilado = 0;
        this.contVIP = 0;
        this.indexPeliculas = 0;
        this.indexClientes = 0;
    }

    public void comprarEntrada(Pelicula pelicula, Cliente cliente) {
        pelicula.reservarEntrada();
        cliente.comprarEntrada();
    }

    public boolean anadirPelicula(Pelicula pelicula) {
        if (indexPeliculas <= NUMERO_PELICULAS && pelicula != null) {
            peliculas[indexPeliculas] = pelicula;
            indexPeliculas++;
            return true;
        }
        return false;
    }

    public boolean borrarPelicula(String titulo, String anioEstreno) {
        for (int i = 0; i < indexPeliculas; i++) {
            if (peliculas[i].getAnioEstreno().equals(anioEstreno) && peliculas[i].getTitulo().equals(titulo)) {
                for (int j = i; j < indexPeliculas; j++) {
                    peliculas[j + 1] = peliculas[j];
                }
                indexPeliculas--;
                return true;
            }
        }
        return false;
    }

    public Pelicula obtenerPelicula(int n){
        return peliculas[n];
    }

    public boolean anadirCliente(Cliente cliente) {
        if (indexClientes <= NUMERO_CLIENTES && cliente != null) {
            clientes[indexClientes] = cliente;
            return true;
        }
        return false;
    }

    public void cambiarDatos(String localidad, String nombre) {
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public void cambiarDatos(String localidad) {
        this.nombre = localidad;
        this.localidad = localidad;
    }

    public void mostrarPeliculas() {
        for (int i = 0; i < indexPeliculas; i++) {
            System.out.println(peliculas[i]);
        }
    }

    public void mostrarClientes() {
        for (int i = 0; i < indexClientes; i++) {
            System.out.println(clientes[i]);
        }
    }

    public int getIndex(){
        return indexPeliculas;
    }

}
