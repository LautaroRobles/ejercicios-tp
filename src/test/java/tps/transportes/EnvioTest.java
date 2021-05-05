package tps.transportes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EnvioTest {

    private Envio envio;
    private List<Paquete> paquetes;
    private List<EnvioStrategy> estrategias;

    @Before
    public void init()
    {
        this.envio = new Envio();
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete();
        Paquete paquete3 = new Paquete();
        paquete1.setPeso(20.0);
        paquete2.setPeso(35.0);
        paquete3.setPeso(70.0);
        this.paquetes = new ArrayList<>();
        paquetes.add(paquete1);
        paquetes.add(paquete2);
        paquetes.add(paquete3);
        this.envio.setPaquetes(this.paquetes);
        this.envio.setDireccionDesde("Calle Falsa 123");
        this.envio.setDireccionHasta("ajkghkjsrhopjik");
    }

    @Test
    public void envioEstandar()
    {
        EnvioEstandar envioEstandar = new EnvioEstandar();
        envioEstandar.setDistanciaLocal(40.0);
        envioEstandar.setTarifaCorta(10.0);
        envioEstandar.setTarifaLarga(20.0);

        this.envio.setEstrategiaEnvio(envioEstandar);

        // Envio larga distancia
        this.envio.setDistaciaEnKm(60.0);
        Double precioFinal = this.envio.calcularPrecio();
        Assert.assertEquals((Double) 2500.0, precioFinal);

        // Envio corta distancia
        this.envio.setDistaciaEnKm(20.0);
        precioFinal = this.envio.calcularPrecio();
        Assert.assertEquals((Double) 1250.0, precioFinal);
    }

    @Test
    public void envioFedex()
    {
        EnvioFedEx envioFedEx = new EnvioFedEx();
        envioFedEx.setTarifa(2.0);

        this.envio.setEstrategiaEnvio(envioFedEx);

        Double precioFinal = this.envio.calcularPrecio();
        Assert.assertEquals((Double) 15625.0, precioFinal);
    }
}
