package tps.transportes;

public class EnvioEstandar extends EnvioStrategy{
    private Double tarifaCorta;
    private Double tarifaLarga;
    private Double distanciaLocal;

    public Double calcularPrecio(Envio envio)
    {
        // Distancia Local
        if(envio.getDistaciaEnKm() < this.distanciaLocal)
        {
            return this.tarifaCorta * envio.calcularPesoTotal();
        }
        // Larga Distancia
        else
        {
            return this.tarifaLarga * envio.calcularPesoTotal();
        }
    }

    public Double getTarifaCorta() {
        return tarifaCorta;
    }

    public void setTarifaCorta(Double tarifaCorta) {
        this.tarifaCorta = tarifaCorta;
    }

    public Double getTarifaLarga() {
        return tarifaLarga;
    }

    public void setTarifaLarga(Double tarifaLarga) {
        this.tarifaLarga = tarifaLarga;
    }

    public Double getDistanciaLocal() {
        return distanciaLocal;
    }

    public void setDistanciaLocal(Double distanciaLocal) {
        this.distanciaLocal = distanciaLocal;
    }
}
