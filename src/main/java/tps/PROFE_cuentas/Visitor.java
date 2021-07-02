package tps.PROFE_cuentas;

public interface Visitor {
    public int interesTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito);
    public int interesCuentaCorriente(CuentaCorriente cuentaCorriente);
    public int interesCajaDeAhorro(CajaDeAhorro cajaDeAhorro);
}
