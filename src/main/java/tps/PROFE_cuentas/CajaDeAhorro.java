package tps.PROFE_cuentas;

public class CajaDeAhorro implements Visitable{

    private int montoTotal;

    @Override
    public int aceptar(Visitor visitor) {
        return visitor.interesCajaDeAhorro(this);
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
}
