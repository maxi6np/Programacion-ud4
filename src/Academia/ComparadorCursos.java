package Academia;

import java.util.Comparator;

public class ComparadorCursos implements Comparator<Curso>{

    @Override
    public int compare(Curso c1, Curso c2) {
        if (c1 == null || c2 == null) {
            return 0;
        }
        if (c1.getNombre() == c2.getNombre() && c1.getPrecio() == c2.getPrecio() && c1.getHorasDuracion() == c2.getHorasDuracion()){
            return 1;
        }
        return -1;
    }
}
