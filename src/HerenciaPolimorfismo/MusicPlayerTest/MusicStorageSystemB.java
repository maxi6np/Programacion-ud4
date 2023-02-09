package HerenciaPolimorfismo.MusicPlayerTest;

public class MusicStorageSystemB extends MusicStorageSystem{

    public MusicStorageSystemB(int tamanioLista) {
        super(tamanioLista);
    }
    public boolean addMusic(String musica) {
        for(int i = 0; i < listaMusica.length; i++){
            if (listaMusica[i] == null){
                listaMusica[i] = musica;
                setIndex(getIndex() + 1);
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MusicStorageSystemB{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
