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
        String[] listaCanciones = musicStorage.getAllMusic();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < listaCanciones.length; i++) {
            sb.append((i + 1));
            sb.append(". ");
            sb.append(listaCanciones[i]);
            sb.append("\n");
        }

        return sb.toString();
    }
}
