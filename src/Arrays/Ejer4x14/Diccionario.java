package Arrays.Ejer4x14;

public class Diccionario {

    private Palabra[] listaPalabras;
    private int pos;
    public static final int MAX_PALABRAS = 10;

    public Diccionario(int numPalabras) {
        if (numPalabras > MAX_PALABRAS) {
            listaPalabras = new Palabra[MAX_PALABRAS];
        } else {
            listaPalabras = new Palabra[numPalabras];
        }
        pos = 0;
    }

    public void insertarPalabra(Palabra palabra) {
        listaPalabras[pos] = palabra;
        pos++;
    }

    public Palabra obtenerPalabra(int posicion) {
        if (posicion < 0 || posicion > pos) {
            return null;
        } else {
            return listaPalabras[posicion];
        }
    }

    public String traducirPalabra(int posicion) {
        if (posicion < 0 || posicion > pos) {
            return null;
        } else {
            return listaPalabras[posicion].getEn();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pos; i++) {
            sb.append(listaPalabras[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public void escribirDiccionario() {
        System.out.println(this);
    }

    public boolean tieneEspacio() {
        return pos < listaPalabras.length;
    }

    public boolean existeIndex(int index) {
        return pos > index && index > 0;
    }

}
