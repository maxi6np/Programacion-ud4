package HerenciaPolimorfismo.Enum;

import java.util.ArrayList;
import java.util.Arrays;

public enum EnumActividad {
    ACTIVIDAD_LUNES ("dormir"),
    ACTIVIDAD_MARTES ("estudiar inglés"),
    ACTIVIDAD_MIERCOLES ("trabajar como developer junior"),
    ACTIVIDAD_JUEVES ("limpiar la habitacion"),
    ACTIVIDAD_VIERNES ("cocinar la ratatouille"),
    ACTIVIDAD_SABADO ("programar porque no apruebo ni pagando"),
    ACTIVIDAD_DOMINGO ("prepararse para la purga");


    private final String actividades;
    EnumActividad(String actividades){
        this.actividades = actividades;
    }

    public String getActividades() {
        return actividades;
    }
}
