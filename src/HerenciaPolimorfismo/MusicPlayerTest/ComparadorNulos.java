package HerenciaPolimorfismo.MusicPlayerTest;

import java.util.Comparator;

public class ComparadorNulos implements Comparator<String> {

    @Override
    public int compare(String cancion1, String cancion2) {
        if (cancion1 == null && cancion2 == null) {
            return 0;
        }
        if (cancion1 == null) {
            return 1;
        }
        return -1;
    }
}

