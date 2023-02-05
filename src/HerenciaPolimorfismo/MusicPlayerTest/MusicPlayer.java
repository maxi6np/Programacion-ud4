package HerenciaPolimorfismo.MusicPlayerTest;



public class MusicPlayer{
    private MusicStorage musicStorage;

    public MusicPlayer(MusicStorage musicStorage) {
        this.musicStorage = musicStorage;
    }

    public String anadir(String cancion) {
        if (musicStorage.addMusic(cancion)){
            return "Añadida correctamente.";
        }
        return "No puede añadir más música.";
    }

    public String eliminar(String cancion) {
        if (musicStorage.deleteMusic(cancion)){
            return "Borrada correctamente.";
        }
        return "No se ha podido borrar.";
    }

    public String mostrar() {
        String[] listaMusica = musicStorage.getAllMusic();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < listaMusica.length; i++) {
            if (listaMusica[i] != null) {
                sb.append((i + 1) + ". " + listaMusica[i] + "\n");
            }
        }
        return sb.toString();
    }
}
