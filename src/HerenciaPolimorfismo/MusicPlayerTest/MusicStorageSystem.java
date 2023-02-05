package HerenciaPolimorfismo.MusicPlayerTest;

import java.util.Arrays;

public abstract class MusicStorageSystem implements MusicStorage{
    private String[] listaMusica;

    public MusicStorageSystem(int tamanioLista) {
        listaMusica = new String[tamanioLista];
    }

    @Override
    public boolean addMusic(String musica) {
        for(int i = 0; i < listaMusica.length; i++){
            if (listaMusica[i] == null){
                listaMusica[i] = musica;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteMusic(String musica) {
        for(int i = 0; i < listaMusica.length; i++){
            if (listaMusica[i] != null && listaMusica[i].equals(musica)){
                listaMusica[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] getAllMusic() {
        return listaMusica;
    }

    abstract void ordenarListaMusica();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MusicStorageSystem{");
        sb.append("listaMusica=").append(Arrays.toString(listaMusica));
        sb.append('}');
        return sb.toString();
    }
}
