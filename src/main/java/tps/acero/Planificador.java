package tps.acero;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Planificador {
    public void planificar(List<Entrega> entregas, Date fechaPrimerEntrega, Periodicidad periodicidad) {
        for(int i = 0; i < entregas.size(); i++) {
            entregas.get(i).setFechaEntrega(
                    this.calcularFechaEntrega(i, fechaPrimerEntrega, periodicidad)
            );
        }
    }

    private Date calcularFechaEntrega(int indexEntrega, Date fechaPrimerEntrega, Periodicidad periodicidad) {
        Date fecha = null;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaPrimerEntrega);

        switch (periodicidad) {
            case UNICA_VEZ:
                fecha = fechaPrimerEntrega;
                break;
            case SEMANAL:
                calendar.add(Calendar.WEEK_OF_YEAR, indexEntrega); // Le agrego una semana por cada entrega
                fecha = calendar.getTime();
                break;
            case MENSUAL:
                calendar.add(Calendar.MONTH, indexEntrega); // Le agrego una semana por cada entrega
                fecha = calendar.getTime();
                break;
        }

        return fecha;
    }
}
