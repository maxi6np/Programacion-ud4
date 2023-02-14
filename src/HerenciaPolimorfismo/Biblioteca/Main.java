package HerenciaPolimorfismo.Biblioteca;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();
        biblio.registar(new Libro(1,"El arte de la guerra",1772,"Sun Tzu"));
        biblio.registar(new Revista(2,"HOLA",111));
        biblio.registar(new Periodico(3,"La Nueva España","09/02/2023"));
        biblio.registar(new Videojuego(4,"The Last Of Us",18));
        biblio.registar(new Libro(5,"Padre Rico, Padre Pobre",1997,"Robert Kiyosaki"));

        biblio.buscar(6);

        biblio.prestar(1);
        biblio.devolver(1);

        biblio.mostrarCatalogo();
    }
}
