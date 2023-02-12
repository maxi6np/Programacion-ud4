package HerenciaPolimorfismo.Biblioteca;

public abstract class Elemento {
    public int codigoNumerico;
    public boolean estaPrestado;

    public Elemento(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
        this.estaPrestado = false;
    }

    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public boolean isEstaPrestado() {
        return estaPrestado;
    }

    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }
}
