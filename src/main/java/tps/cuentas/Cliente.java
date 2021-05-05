package tps.cuentas;

import java.util.List;

public class Cliente {
    private Integer dni;
    private List<Cuenta> cuentas;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
