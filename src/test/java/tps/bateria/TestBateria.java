package tps.bateria;

import org.junit.Test;

public class TestBateria {

    @Test
    public void test() {
        Bateria bateria = new Bateria();
        bateria.setTiempo(2);

        TiempoRestante observerTiempoRestante = new TiempoRestante();

        bateria.suscribirse(observerTiempoRestante);

        System.out.println(observerTiempoRestante.getTiempoRestante());

        bateria.setTiempo(3);

        System.out.println(observerTiempoRestante.getTiempoRestante());
    }
}
