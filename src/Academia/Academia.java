package Academia;


import java.util.Arrays;
import java.util.Comparator;

public class Academia extends ComparadorCursos {
    public Curso[] listadoCursos;
    private int tamanioLista;
    private int index;

    public Academia(int tamanioLista) {
        this.tamanioLista = tamanioLista;
        listadoCursos = new Curso[tamanioLista];
        index = 0;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static boolean compararCursos(Curso curso1, Curso curso2) {
        if ((curso1.equals(curso2)) &&
                (curso1.getClass() == curso2.getClass())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean anadirCurso(Curso curso) {
        if (getIndex() < listadoCursos.length && curso != null) {
            if (!(compararCursos(curso, listadoCursos[getIndex()]))) {
                listadoCursos[getIndex()] = curso;
                index++;
                return true;
            }
        }
        return false;
    }

    public boolean borrarCurso(Curso curso) {
        for (int i = 0; i < listadoCursos.length; i++) {
            if (listadoCursos[i] != null && listadoCursos[i].equals(curso)) {
                listadoCursos[i] = null;
                for (int j = i; j < listadoCursos.length - 1; j++) {
                    listadoCursos[j] = listadoCursos[j + 1];
                }
                index--;
                return true;
            }
        }
        return false;
    }

    public void mostrarCursos() {
        for (int i = 0; i < index; i++) {
            System.out.println("---------------------------------");
            System.out.println("\t\tCURSO NÚMERO " + (i + 1));
            System.out.println(listadoCursos[i].toString());
            System.out.println("Tipo: " + listadoCursos[i].getClass().getSimpleName());
            System.out.println("---------------------------------");
        }
    }

    public Curso[] cursosOficiales() {
        Curso[] oficiales = new Curso[listadoCursos.length];
        for (int i = 0; i < index; i++) {
            Curso cursoActual = listadoCursos[i];
            if (cursoActual.getClass().getSimpleName().equals("CursoTeorico")){
                oficiales[i] = cursoActual;
            }
        }

        return oficiales;
    }

    public Curso[] cursosPorHoras() {
        Curso[] porHoras = new Curso[listadoCursos.length];

        System.arraycopy(listadoCursos, 0, porHoras, 0, listadoCursos.length);

        Arrays.sort(porHoras, new ComparadorCursos());
        return porHoras;
    }

    public Curso[] cursoMasLargoYMasCorto() {
        Curso cursoMasLargo = listadoCursos[0];
        Curso cursoMasCorto = listadoCursos[0];

        for (int i = 1; i < index; i++) {
            Curso cursoActual = listadoCursos[i];
            if (cursoActual.getHorasDuracion() > cursoMasLargo.getHorasDuracion()) {
                cursoMasLargo = cursoActual;
            }
            if (cursoActual.getHorasDuracion() < cursoMasCorto.getHorasDuracion()) {
                cursoMasCorto = cursoActual;
            }
        }

        return new Curso[]{cursoMasLargo, cursoMasCorto};
    }

    public Curso[] cursosBaratos() {
        Curso[] baratos = new Curso[listadoCursos.length];
        double media;
        double suma = 0;

        for (int i = 0; i < index; i++) {
            suma += listadoCursos[i].getPrecio();
        }
        media = suma / index;

        System.out.println("La media es: " + media);

        for (int i = 0; i < index; i++) {
            if (listadoCursos[i].getPrecio() < media){
                baratos[i] = listadoCursos[i];
            }
        }

        return baratos;
    }
}
