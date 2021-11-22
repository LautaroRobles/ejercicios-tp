public class CuentaDiez implements ICuenta{
    private float interes;
    private float descubierto;
    private TarjetaDebito tarjetaDebito;
    private TarjetaCredito tarjetaCredito;
    private Regalo regalo;

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public float getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(float descubierto) {
        this.descubierto = descubierto;
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
