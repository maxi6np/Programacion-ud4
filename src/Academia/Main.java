package Academia;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Academia academia = new Academia(6);

        CursoMixto m1 = new CursoMixto("pepe",60.10,2,5,6);
        CursoMixto m2 = new CursoMixto("orange",89.20,3,4,4);
        CursoTeorico t1 = new CursoTeorico("isabela",70.70,7,true);
        CursoPractico p1 = new CursoPractico("silla",50.70,6,"asturias");
        CursoPractico p2 = new CursoPractico("mellow",55.50,1,"cantabria");

        academia.anadirCurso(m1);
        academia.anadirCurso(m2);
        academia.anadirCurso(t1);
        academia.anadirCurso(p1);
        academia.anadirCurso(p2);

        academia.borrarCurso(p2);

        System.out.println("ACADEMIA");
        academia.mostrarCursos();
        System.out.println("Cursos oficiales: " + Arrays.toString(academia.cursosOficiales()));
        System.out.println("-------------------------------------------");
        System.out.println("Cursos ordenados por horas (mayor a menor): " + Arrays.toString(academia.cursosPorHoras()));
        System.out.println("-------------------------------------------");
        System.out.println("Curso más largo y más corto: " + Arrays.toString(academia.cursoMasLargoYMasCorto()));
        System.out.println("-------------------------------------------");
        System.out.println("Cursos más baratos que la media de precio de todos ellos: " + Arrays.toString(academia.cursosBaratos()));
    }
}
