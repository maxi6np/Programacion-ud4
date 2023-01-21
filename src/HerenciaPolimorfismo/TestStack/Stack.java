package HerenciaPolimorfismo.TestStack;

import java.util.Arrays;

public class Stack {
    private int tamanoPila;
    private String valores[];
    private int limite; //indica la posición del último elemento insertado

    public Stack(int tamanoPila) {
        this.tamanoPila = tamanoPila;
        valores = new String[tamanoPila];
        limite = -1;
    }

    public boolean empty() {
        return limite == -1;
    }

    public boolean full() {
        return (limite + 1) == tamanoPila;
    }

    public boolean push(String planta) {
        if (!full()) {
            valores[++limite] = planta;
            return true;
        } else {
            return false; //no hay espacio
        }
    }

    public String pop() {
        if (!empty()) {
            return valores[limite--];
        } else {
            return "No se puede extraer ningún elemento de la pila porque está vacía";
        }
    }

    public String show() {
        for (String a : valores) {
            return a;
        }
        return "";
    }

    public String[] getAll() {
        for (String a : valores) {
            return new String[]{a};
        }
        return new String[]{""};
    }

    public boolean search(String planta) {
        if (Arrays.asList(valores).contains(planta)){
            return true;
        }
        return false;
    }


}
