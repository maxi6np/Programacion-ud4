package HerenciaPolimorfismo.MusicPlayerTest;

public class MusicStorageSystemB extends MusicStorageSystem{

    public MusicStorageSystemB(int tamanioLista) {
        super(tamanioLista);
    }
    public void ordenarListaMusica() {
        // No hace nada, la lista no se ordena
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MusicStorageSystemB{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
