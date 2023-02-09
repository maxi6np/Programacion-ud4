package HerenciaPolimorfismo.MusicPlayerTest;

import java.util.Arrays;

public abstract class MusicStorageSystem implements MusicStorage{
    protected String[] listaMusica;

    public int index;

    public MusicStorageSystem(int tamanioLista) {
        listaMusica = new String[tamanioLista];
        this.index = 0;
    }



    @Override
    public boolean deleteMusic(String musica) {
        for(int i = 0; i < listaMusica.length; i++){
            if (listaMusica[i] != null && listaMusica[i].equals(musica)){
                listaMusica[i] = null;
                for (int j = i; j < listaMusica.length - 1; j++) {
                    listaMusica[j] = listaMusica[j + 1];
                }
                index--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String[] getAllMusic() {
        String[] aux = new String[index];

        for (int i = 0; i < index; i++) {
            aux[i] = listaMusica[i];
        }
        return aux;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MusicStorageSystem{");
        sb.append("listaMusica=").append(Arrays.toString(listaMusica));
        sb.append('}');
        return sb.toString();
    }
}
