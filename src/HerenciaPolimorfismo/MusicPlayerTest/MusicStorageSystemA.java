package HerenciaPolimorfismo.MusicPlayerTest;

import java.util.Arrays;

public class MusicStorageSystemA extends MusicStorageSystem {

    public MusicStorageSystemA(int tamanioLista) {
        super(tamanioLista);
    }

    public void ordenarListaMusica() {
        Arrays.sort(getAllMusic(), new ComparadorNulos());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MusicStorageSystemA{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
