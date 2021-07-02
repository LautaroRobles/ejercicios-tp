package tps.PROFE_cuentas;

import java.util.List;

public class Cliente {
    private List<Visitable> cuentas;

    public int calcularInteres() {
        InteresMensual interesMensual = new InteresMensual();
        return interesMensual.interesTotal(this.cuentas);
    }

    public List<Visitable> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Visitable> cuentas) {
        this.cuentas = cuentas;
    }
}
