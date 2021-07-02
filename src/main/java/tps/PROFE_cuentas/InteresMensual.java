package tps.PROFE_cuentas;

import java.util.List;

public class InteresMensual implements Visitor{

    @Override
    public int interesTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        return (int) Math.round(tarjetaDeCredito.getInteres() * 0.05);
    }

    @Override
    public int interesCuentaCorriente(CuentaCorriente cuentaCorriente) {
        return (int) Math.round(cuentaCorriente.getMontoTotal() * -0.01);
    }

    public int interesCajaDeAhorro(CajaDeAhorro cajaDeAhorro) {
        return (int) Math.round(cajaDeAhorro.getMontoTotal() * -0.01);
    }

    public int interesTotal(List<Visitable> cuentas) {
        int interes = 0;
        for (Visitable cuenta : cuentas) {
            interes += cuenta.aceptar(this);
        }
        return interes;
    }
}
