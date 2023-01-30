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
        if (full()) {
            return false;
        }
        limite++;
        valores[limite] = planta;
        return true;
    }

    public String pop() {
        if (empty()) {
            return null;
        }
        String valor = valores[limite];
        limite--;
        return valor;
    }

    //Muestra todos los elementos de la pila (sin nulls)
    public void show() {
        for (int i = limite; i >= 0; i--) {
            System.out.println(valores[i]);;
        }
    }

    //Devuelve unarray con todos los elementos de la pila (sin nulls)
    public String[] getAll() {
        return Arrays.copyOfRange(valores, 0, limite + 1);
    }

    //Comprueba  si  un  String  pasado  como  parámetro,  está  presente  en  la pila o no
    public boolean search(String planta) {
        for (int i = 0; i <= limite; i++) {
            if (valores[i].equals(planta)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stack{");
        sb.append("tamanoPila=").append(tamanoPila);
        sb.append(", valores=").append(Arrays.toString(valores));
        sb.append(", limite=").append(limite);
        sb.append('}');
        return sb.toString();
    }
}
