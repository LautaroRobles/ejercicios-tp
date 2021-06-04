package tps.acero;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private List<Entrega> entregas;

    public void planificar(Date fechaPrimerEntrega, Periodicidad periodicidad) {
        Planificador planificador = new Planificador();
        planificador.planificar(this.entregas, fechaPrimerEntrega, periodicidad);
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }
}
