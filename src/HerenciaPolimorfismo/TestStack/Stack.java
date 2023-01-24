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
            return null;
        }
    }

    public String show() {
        for (String a : valores) {
            return a;
        }
        return "";
    }

    public String[] getAll() {
        String[] todos = new String[valores.length];
        for (String a : valores) {
            if ( a != null) {
                todos[limite] = a;
                limite++;
            }else{
                limite--;
            }
        }
        return todos;
    }

    public boolean search(String planta) {
        if (Arrays.asList(valores).contains(planta)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "tamanoPila=" + tamanoPila +
                ", valores=" + Arrays.toString(valores) +
                ", limite=" + limite +
                '}';
    }


}
