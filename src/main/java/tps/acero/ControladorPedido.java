package tps.acero;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControladorPedido {
    private Pedido pedido;

    public void crearPedido(int idCliente, Date fechaPrimerEntrega, int cantidadEntregas, Periodicidad periodicidad) {
        Empresa empresa = new Empresa();

        Cliente cliente = empresa.buscarCliente(idCliente);
        List<Entrega> entregas = new ArrayList<>();

        for(int i = 0; i < cantidadEntregas; i++) {
            entregas.add(new Entrega());
        }

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setEntregas(entregas);
        pedido.planificar(fechaPrimerEntrega, periodicidad);

        this.pedido = pedido;
    }

    public List<Entrega> verEntregas() {
        return this.pedido.getEntregas();
    }

    public List<Envase> envasesDisponibles(int idArticulo) {
        Empresa empresa = new Empresa();
        return empresa.buscarEnvasesDisponibles(idArticulo);
    }

    public void ingresarArticulo(int indexEntrega, int idArticulo, int cantidad, int idEnvase) {
        Empresa empresa = new Empresa();

        Articulo articulo = empresa.buscarArticulo(idArticulo);
        Envase envase = empresa.buscarEnvase(idEnvase);
        Entrega entrega = this.pedido.getEntregas().get(indexEntrega);

        entrega.setArticulo(articulo);
        entrega.setCantidad(cantidad);
        entrega.envasar(envase);
    }

    public Pedido getPedido() {
        return pedido;
    }
}
