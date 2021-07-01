package tps.servicioDeEmergencias;

import java.util.List;

public class UnidadAdministrativa extends Base{
    private List<Base> bases;

    @Override
    public float getTiempoMedioDeAsistencia() {
        return (float)bases.stream().mapToDouble(Base::getTiempoMedioDeAsistencia).sum() / bases.size();
    }

    @Override
    public int getCantidadAmbulancias() {
        return bases.stream().mapToInt(Base::getCantidadAmbulancias).sum();
    }

    public List<Base> getBases() {
        return bases;
    }

    public void setBases(List<Base> bases) {
        this.bases = bases;
    }
}
