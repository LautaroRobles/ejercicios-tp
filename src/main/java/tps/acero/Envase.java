package tps.acero;

public class Envase {
    private int idEnvase;
    private int capacidad;
    private Articulo articulo;

    public int getIdEnvase() {
        return idEnvase;
    }

    public void setIdEnvase(int idEnvase) {
        this.idEnvase = idEnvase;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
