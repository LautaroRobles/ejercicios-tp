public class CreadorCuentaDiez extends CreadorCuenta {

    @Override
    public ICuenta CrearCuenta() {
        // Creo tarjeta de debito
        TarjetaDebito tarjetaDebito = new TarjetaDebito();
        tarjetaDebito.setCosto(0);

        // Creo tarjeta de credito
        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        tarjetaCredito.setCosto(180);
        tarjetaCredito.setNomina(60);

        CuentaDiez cuenta = new CuentaDiez();
        cuenta.setInteres(1);
        cuenta.setDescubierto(50);
        cuenta.setTarjetaDebito(tarjetaDebito);
        cuenta.setTarjetaCredito(tarjetaCredito);
        cuenta.setRegalo(new ReproductorCD());

        return cuenta;
    }
}
