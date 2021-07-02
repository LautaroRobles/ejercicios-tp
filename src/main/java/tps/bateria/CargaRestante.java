package tps.bateria;

public class CargaRestante implements Observer{

    private int cargaRestante;

    @Override
    public void update(Observable observable) {
        this.cargaRestante = ((Bateria)observable).getCarga();
    }

    public int getCargaRestante() {
        return cargaRestante;
    }

    public void setCargaRestante(int cargaRestante) {
        this.cargaRestante = cargaRestante;
    }
}
