package tps.bateria;

public class Bateria extends Observable{
    private boolean conectado;
    private boolean cargando;
    private int carga;
    private int tiempo;

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
        this.notificar();
    }

    public boolean isCargando() {
        return cargando;
    }

    public void setCargando(boolean cargando) {
        this.cargando = cargando;
        this.notificar();
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
        this.notificar();
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
        this.notificar();
    }
}
