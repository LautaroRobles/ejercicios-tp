public class CreadorCuentaOro extends CreadorCuenta {

    @Override
    public ICuenta CrearCuenta() {
        // Creo tarjeta de debito
        TarjetaDebito tarjetaDebito = new TarjetaDebito();
        tarjetaDebito.setCosto(0);

        // Creo tarjeta de credito
        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        tarjetaCredito.setPension(60);
        tarjetaCredito.setCosto(0);

        CuentaOro cuenta = new CuentaOro();
        cuenta.setInteres(1.5f);
        cuenta.setTarjetaDebito(tarjetaDebito);
        cuenta.setTarjetaCredito(tarjetaCredito);
        cuenta.setRegalo(new Seguro());

        return cuenta;
    }
}