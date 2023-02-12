package HerenciaPolimorfismo.Biblioteca;

public class Biblioteca {
    public Elemento[] catalogo;
    private int index;
    private boolean estaPrestado;

    public Biblioteca() {
        catalogo = new Elemento[100];
        index = 0;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public void registar(Elemento elemento) {
        if (getIndex() < catalogo.length && elemento != null) {
            catalogo[getIndex()] = elemento;
            index++;

        } else {
            System.out.println("Catálogo completo.");
        }
    }

    public Elemento buscar(int codigo) {
        for (int i = 0; i < index; i++) {
            if (catalogo[i].getCodigoNumerico() == codigo) {
                System.out.print("Elemento con el código " + codigo + " encontrado: ");
                return catalogo[i];
            }
        }
        System.out.println("Elemento con el código " + codigo + " no encontrado.");
        return null;
    }

    public boolean prestar(int codigo) {
        for (int i = 0; i < index; i++) {
            if (catalogo[i].getCodigoNumerico() == codigo){
                if ((catalogo[i] instanceof Libro || catalogo[i] instanceof Videojuego)
                        && !estaPrestado) {
                    catalogo[i].setEstaPrestado(true);
                    System.out.println("Prestado: " + catalogo[i]);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean devolver(int codigo) {
        for (int i = 0; i < index; i++) {
            if(catalogo[i].getCodigoNumerico() == codigo){
                if (catalogo[i].estaPrestado) {
                    catalogo[i].setEstaPrestado(false);
                    System.out.println("Devuelto: " + catalogo[i]);
                    return true;
                }
            }
        }
        return false;
    }

    public void reiniciarPrestamos() {
        for (Elemento elemento : catalogo) {
            if (elemento instanceof Libro || elemento instanceof Videojuego) {
                elemento.setEstaPrestado(false);
            }
        }
    }

    public void mostrarCatalogo() {
        System.out.println("------------------------------------------------------");
        System.out.println("El catálogo completo de la biblioteca contiene:");
        for (int i = 0; i < index; i++) {
            System.out.println((i + 1) + ". " + catalogo[i].toString());
        }
        System.out.println("---------------------------------------------------------");
    }
}
