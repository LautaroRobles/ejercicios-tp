package tps.bateria;

public class TiempoRestante implements Observer{

    private int tiempoRestante;

    @Override
    public void update(Observable observable) {
        this.tiempoRestante = ((Bateria)observable).getTiempo();
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }
}
