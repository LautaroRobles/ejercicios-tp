package tps.transportes;

public class EnvioFedEx extends EnvioStrategy {
    private Double tarifa;

    public Double calcularPrecio(Envio envio)
    {
        return Math.pow(envio.calcularPesoTotal(), tarifa);
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
}
