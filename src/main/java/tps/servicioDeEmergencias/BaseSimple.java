package tps.servicioDeEmergencias;

public class BaseSimple extends Base{
    private int cantidadAmbulancias;
    private float tiempoMedioDeAsistencia;

    @Override
    public int getCantidadAmbulancias() {
        return cantidadAmbulancias;
    }

    public void setCantidadAmbulancias(int cantidadAmbulancias) {
        this.cantidadAmbulancias = cantidadAmbulancias;
    }

    @Override
    public float getTiempoMedioDeAsistencia() {
        return tiempoMedioDeAsistencia;
    }

    public void setTiempoMedioDeAsistencia(float tiempoMedioDeAsistencia) {
        this.tiempoMedioDeAsistencia = tiempoMedioDeAsistencia;
    }
}
