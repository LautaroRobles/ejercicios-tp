import org.junit.Assert;
import org.junit.Test;

public class TestCuentas {
    @Test
    public void CuentaJoven() {
        CreadorCuentaJoven creador = new CreadorCuentaJoven();
        CuentaJoven cuentaJoven = (CuentaJoven) creador.CrearCuenta();

        Assert.assertEquals(2f, cuentaJoven.getInteres(), 0.0);
        Assert.assertEquals(0, cuentaJoven.getTarjetaDebito().getCosto());
        Assert.assertEquals(CDMusica.class, cuentaJoven.getRegalo().getClass());
    }
    @Test
    public void CuentaDiez() {
        CreadorCuentaDiez creador = new CreadorCuentaDiez();
        CuentaDiez cuentaDiez = (CuentaDiez) creador.CrearCuenta();

        Assert.assertEquals(1f, cuentaDiez.getInteres(), 0.0);
        Assert.assertEquals(50f, cuentaDiez.getDescubierto(), 0.0);
        Assert.assertEquals(0, cuentaDiez.getTarjetaDebito().getCosto());
        Assert.assertEquals(180, cuentaDiez.getTarjetaCredito().getCosto());
        Assert.assertEquals(60f, cuentaDiez.getTarjetaCredito().getNomina(), 0.0);
        Assert.assertEquals(ReproductorCD.class, cuentaDiez.getRegalo().getClass());
        Assert.assertNotEquals(CDMusica.class, cuentaDiez.getRegalo().getClass());
    }
    @Test
    public void CuentaOro() {
        CreadorCuentaOro creador = new CreadorCuentaOro();
        CuentaOro cuentaOro = (CuentaOro) creador.CrearCuenta();

        Assert.assertEquals(1.5f, cuentaOro.getInteres(), 0.0);
        Assert.assertEquals(0, cuentaOro.getTarjetaDebito().getCosto());
        Assert.assertEquals(0, cuentaOro.getTarjetaCredito().getCosto());
        Assert.assertEquals(60f, cuentaOro.getTarjetaCredito().getPension(), 0.0);
        Assert.assertEquals(Seguro.class, cuentaOro.getRegalo().getClass());
    }
    @Test
    public void CuentaEstandar() {
        CreadorCuentaEstandar creador = new CreadorCuentaEstandar();
        CuentaEstandar cuentaEstandar = (CuentaEstandar) creador.CrearCuenta();

        Assert.assertEquals(0.5f, cuentaEstandar.getInteres(), 0.0);
        Assert.assertEquals(50, cuentaEstandar.getTarjetaDebito().getCosto());
    }
}
