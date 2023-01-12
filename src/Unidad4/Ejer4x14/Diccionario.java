package Unidad4.Ejer4x14;

import java.util.Arrays;

public class Diccionario {
    private Palabra[] listaPalabras ;
    private final int MAX_PALABRAS = 5;
    private int pos;

    public Diccionario(int numPalabras) {
        if(numPalabras > MAX_PALABRAS){
            listaPalabras = new Palabra[MAX_PALABRAS];
        } else {
            listaPalabras = new Palabra[numPalabras];
        }
        pos = 0;
    }

    public void insertarPalabra(Palabra nuevaPalabra){
        if(pos < MAX_PALABRAS){
            listaPalabras[pos] = nuevaPalabra;
            System.out.println(Arrays.toString(listaPalabras));
            pos++;
        } else{
            System.out.println("Limite de palabras alcanzado");
        }
    }

    public Palabra obtenerPalabra(int posicionPalabra){
        if (posicionPalabra < MAX_PALABRAS && posicionPalabra >= 0){
            return listaPalabras[posicionPalabra];
        } else{
            return null;
        }
    }

    //public String traducirPalabra(int palabraTraducir){

    //}

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pos; i++) {
             sb.append(listaPalabras[i].toString());
        }
        return sb.toString();
    }

    public void escribirDiccionario(){
        System.out.println(toString());
    }
}
