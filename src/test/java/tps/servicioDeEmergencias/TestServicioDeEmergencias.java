package tps.servicioDeEmergencias;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestServicioDeEmergencias {

    @Test
    public void test() {
        BaseSimple base1 = new BaseSimple();
        UnidadAdministrativa base2 = new UnidadAdministrativa();
        UnidadAdministrativa base3 = new UnidadAdministrativa();
        BaseSimple base4 = new BaseSimple();

        base1.setCantidadAmbulancias(2);
        base1.setTiempoMedioDeAsistencia(30);
        base4.setCantidadAmbulancias(4);
        base4.setTiempoMedioDeAsistencia(10);

        List<Base> bases1 = new ArrayList<>();
        bases1.add(base1);
        bases1.add(base3);

        base2.setBases(bases1);

        List<Base> bases2 = new ArrayList<>();
        bases2.add(base1);
        bases2.add(base4);

        base3.setBases(bases2);

        System.out.println("Cantidad ambulancias de base 2: " + base2.getCantidadAmbulancias());
        System.out.println("Tiempo medio de asistencia de base 2: " + base2.getTiempoMedioDeAsistencia());

        System.out.println("Cantidad ambulancias de base 3: " + base3.getCantidadAmbulancias());
        System.out.println("Tiempo medio de asistencia de base 3: " + base3.getTiempoMedioDeAsistencia());

    }
}
