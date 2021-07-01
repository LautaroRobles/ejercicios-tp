package tps.servicioDeEmergencias;

public abstract class Base {
    private String nombre;

    public abstract int getCantidadAmbulancias();
    public abstract float getTiempoMedioDeAsistencia();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
