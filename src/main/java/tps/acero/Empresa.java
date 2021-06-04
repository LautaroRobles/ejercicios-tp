package tps.acero;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Empresa {
    private List<Cliente> clientes;
    private List<Articulo> articulos;
    private List<Envase> envases;

    public Empresa() {
        Cliente cliente1 = new Cliente();

        Articulo articulo1 = new Articulo();
        Articulo articulo2 = new Articulo();

        Envase envase1 = new Envase();
        Envase envase2 = new Envase();
        Envase envase3 = new Envase();

        cliente1.setIdCliente(1);

        articulo1.setIdArticulo(1);
        articulo1.setDescripcion("Mouse");
        articulo2.setIdArticulo(2);
        articulo2.setDescripcion("Teclado");

        envase1.setIdEnvase(1);
        envase1.setArticulo(articulo1);
        envase2.setIdEnvase(2);
        envase2.setArticulo(articulo2);
        envase3.setIdEnvase(3);
        envase3.setArticulo(articulo2);

        this.clientes = new ArrayList<>();
        clientes.add(cliente1);

        this.articulos = new ArrayList<>();
        articulos.add(articulo1);
        articulos.add(articulo2);

        this.envases = new ArrayList<>();
        envases.add(envase1);
        envases.add(envase2);
        envases.add(envase3);
    }

    public Cliente buscarCliente(int idCliente) {
        return this.clientes
                .stream()
                .filter(
                        cliente -> cliente.getIdCliente() == idCliente
                )
                .findFirst()
                .orElse(null);
    }

    public Articulo buscarArticulo(int idArticulo) {
        return this.articulos
                .stream()
                .filter(
                        articulo -> articulo.getIdArticulo() == idArticulo
                )
                .findFirst()
                .orElse(null);
    }

    public Envase buscarEnvase(int idEnvase) {
        return this.envases
                .stream()
                .filter(
                        envase -> envase.getIdEnvase() == idEnvase
                )
                .findFirst()
                .orElse(null);
    }

    public List<Envase> buscarEnvasesDisponibles(int idArticulo) {
        Articulo articuloBusqueda = this.buscarArticulo(idArticulo);

        return this.envases.stream().filter(envase ->
                envase.getArticulo().equals(articuloBusqueda)
        ).collect(Collectors.toList());
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public List<Envase> getEnvases() {
        return envases;
    }

    public void setEnvases(List<Envase> envases) {
        this.envases = envases;
    }
}
