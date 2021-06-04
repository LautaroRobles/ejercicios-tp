package tps.acero;

import java.util.Date;

public class Entrega {
    private Articulo articulo;
    private Envase envase;
    private Date fechaEntrega;
    private int cantidad;

    /*
     * Si el envase no es null => establecer en esta entrega ese envase this.envase = envase;
     * Pero si es null, articulo.id pasarle a empresa.buscarEnvasesDisponibles(articulo.id);
     * Y elegis el primero y se lo estableces a esta Entrega this.envase = primerEnvase;
     */
    public void envasar(Envase envase) {
        Empresa empresa = new Empresa();
        if(envase != null) {
            this.envase = envase;
        }else{
            this.envase = empresa.buscarEnvasesDisponibles(articulo.getIdArticulo()).get(0);
        }
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Envase getEnvase() {
        return envase;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
