package tps.PROFE_cuentas;

public class CuentaCorriente implements Visitable{

    private int montoTotal;

    @Override
    public int aceptar(Visitor visitor) {
        return visitor.interesCuentaCorriente(this);
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
}
