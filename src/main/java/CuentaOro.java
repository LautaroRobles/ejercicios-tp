public class CuentaOro implements ICuenta{
    private float interes;
    private TarjetaDebito tarjetaDebito;
    private TarjetaCredito tarjetaCredito;
    private Regalo regalo;

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public TarjetaDebito getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Regalo getRegalo() {
        return regalo;
    }

    public void setRegalo(Regalo regalo) {
        this.regalo = regalo;
    }
}
