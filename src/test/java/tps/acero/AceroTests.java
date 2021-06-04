package tps.acero;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class AceroTests {
    private ControladorPedido controladorPedido;

    @Before
    public void setControladorPedido() {
        this.controladorPedido = new ControladorPedido();

        int idCliente = 1;
        Date fechaPrimerEntrega = new Date();
        int cantidadEntregas = 6;

        this.controladorPedido.crearPedido(idCliente, fechaPrimerEntrega, cantidadEntregas, Periodicidad.UNICA_VEZ);
    }

    @Test
    public void A_crearUnPedido() {
        List<Entrega> entregas = this.controladorPedido.verEntregas();

        System.out.println("idCliente: " + this.controladorPedido.getPedido().getCliente().getIdCliente());

        System.out.println("Fechas de entregas: ");
        for (Entrega entrega : entregas) {
            System.out.println(entrega.getFechaEntrega());
        }

        System.out.println("");
    }

    @Test
    public void B_verEnvases() {
        List<Envase> envases = this.controladorPedido.envasesDisponibles(1);

        System.out.println("Envases disponibles para Mouse");
        for (Envase envase : envases) {
            System.out.println("Envase " + envase.getIdEnvase());
        }

        System.out.println("");

        envases = this.controladorPedido.envasesDisponibles(2);

        System.out.println("Envases disponibles para Teclado");
        for (Envase envase : envases) {
            System.out.println("Envase " + envase.getIdEnvase());
        }

        System.out.println("");
    }

    @Test
    public void C_ingresarUnosArticulos() {
        this.controladorPedido.ingresarArticulo(0, 1, 3, -1);

        String articulo = this.controladorPedido.getPedido().getEntregas().get(0).getArticulo().getDescripcion();
        int idEnvase = this.controladorPedido.getPedido().getEntregas().get(0).getEnvase().getIdEnvase();

        System.out.println("Articulo: "+articulo+" => Envase " + idEnvase);

    }
}
