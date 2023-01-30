package HerenciaPolimorfismo.Animales;

import java.util.ArrayList;

public class Granja {
    private ArrayList<Animal> animales;

    public Granja() {
        animales = new ArrayList();
    }

    public void addAnimal(Animal a) {
        animales.add(a);
    }

    public void mostrarAnimales() {
        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }

    //devuelve el animal de la posición i
    public Animal getAnimal(int i) {
        if (i >= 0 && i <= animales.size()){
            return animales.get(i);
        } else{
            return null;
        }
    }

    public int cuantosPerros() {
        int contador = 0;
        for (Animal a : animales){
            if (a instanceof Perro){
                contador++;
            }
        }
        return contador;
    }

    public void borrarGatos() {
        for (Animal a : animales){
            if (a instanceof Gato){
                animales.remove(a);
            }
        }


    }
}
