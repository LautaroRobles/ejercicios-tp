package tps.PROFE_cuentas;

public class TarjetaDeCredito implements Visitable{

    private int interes;

    @Override
    public int aceptar(Visitor visitor) {
        return visitor.interesTarjetaDeCredito(this);
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
}
