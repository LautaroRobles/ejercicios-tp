public class CreadorCuentaEstandar extends CreadorCuenta {

    @Override
    public ICuenta CrearCuenta() {
        // Creo tarjeta de debito
        TarjetaDebito tarjetaDebito = new TarjetaDebito();
        tarjetaDebito.setCosto(50);

        CuentaEstandar cuenta = new CuentaEstandar();
        cuenta.setInteres(0.5f);
        cuenta.setTarjetaDebito(tarjetaDebito);

        return cuenta;
    }
}