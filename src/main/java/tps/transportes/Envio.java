package tps.transportes;

import java.util.List;

public class Envio {
    private String direccionDesde;
    private String direccionHasta;
    private Double distaciaEnKm;
    private EnvioStrategy estrategiaEnvio;
    private List<Paquete> paquetes;

    public Double calcularPrecio()
    {
        return this.estrategiaEnvio.calcularPrecio(this);
    }

    public Double calcularPesoTotal()
    {
        return this.paquetes.stream().mapToDouble(paquete -> paquete.getPeso()).sum();
    }

    public String getDireccionDesde() {
        return direccionDesde;
    }

    public void setDireccionDesde(String direccionDesde) {
        this.direccionDesde = direccionDesde;
    }

    public String getDireccionHasta() {
        return direccionHasta;
    }

    public void setDireccionHasta(String direccionHasta) {
        this.direccionHasta = direccionHasta;
    }

    public Double getDistaciaEnKm() {
        return distaciaEnKm;
    }

    public void setDistaciaEnKm(Double distaciaEnKm) {
        this.distaciaEnKm = distaciaEnKm;
    }

    public EnvioStrategy getEstrategiaEnvio() {
        return estrategiaEnvio;
    }

    public void setEstrategiaEnvio(EnvioStrategy estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
}
