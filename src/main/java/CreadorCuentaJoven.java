public class CreadorCuentaJoven extends CreadorCuenta {

    @Override
    public ICuenta CrearCuenta() {
        // Creo tarjeta de debito
        TarjetaDebito tarjetaDebito = new TarjetaDebito();
        tarjetaDebito.setCosto(0);

        CuentaJoven cuenta = new CuentaJoven();
        cuenta.setInteres(2);
        cuenta.setTarjetaDebito(tarjetaDebito);
        cuenta.setRegalo(new CDMusica());

        return cuenta;
    }
}
