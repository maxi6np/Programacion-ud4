package HerenciaPolimorfismo.MusicPlayerTest;

import java.util.Arrays;

public class MusicStorageSystemA extends MusicStorageSystem {

    public MusicStorageSystemA(int tamanioLista) {
        super(tamanioLista);
    }

    private void ordenarListaMusica() {
        Arrays.sort(listaMusica, new ComparadorNulos());
    }
    public boolean addMusic(String musica) {
        if (getIndex() < listaMusica.length){
                listaMusica[getIndex()] = musica;
                setIndex(getIndex() + 1);
                ordenarListaMusica();
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MusicStorageSystemA{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
