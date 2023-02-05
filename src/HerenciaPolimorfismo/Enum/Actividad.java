package HerenciaPolimorfismo.Enum;

import Arrays.Ejer4x14.Main;


public class Actividad {
    public static void main(String[] args) {
        Actividad act = new Actividad();
        act.mensajePorDia();
    }
    private EnumDias dia = EnumDias.DOMINGO;
    private static final String LABORAL = "laboral";
    private static final String FINDE = "fin de semana";
    public void mensajePorDia(){
        switch (dia){
            case LUNES -> System.out.println("Hoy es " + dia + ", es " + LABORAL + ". La tarea del día es " + EnumActividad.ACTIVIDAD_LUNES.getActividades());
            case MARTES -> System.out.println("Hoy es " + dia + ", es " + LABORAL + ". La tarea del día es " + EnumActividad.ACTIVIDAD_MARTES.getActividades());
            case MIERCOLES -> System.out.println("Hoy es " + dia + ", es " + LABORAL + ". La tarea del día es " + EnumActividad.ACTIVIDAD_MIERCOLES.getActividades());
            case JUEVES -> System.out.println("Hoy es " + dia + ", es " + LABORAL + ". La tarea del día es " + EnumActividad.ACTIVIDAD_JUEVES.getActividades());
            case VIERNES -> System.out.println("Hoy es " + dia + ", es " + LABORAL + ". La tarea del día es " + EnumActividad.ACTIVIDAD_VIERNES.getActividades());
            case SABADO -> System.out.println("Hoy es " + dia + ", es " + FINDE + ". La tarea del día es " + EnumActividad.ACTIVIDAD_SABADO.getActividades());
            case DOMINGO -> System.out.println("Hoy es " + dia + ", es " + FINDE + ". La tarea del día es " + EnumActividad.ACTIVIDAD_DOMINGO.getActividades());
        }
    }
}
