package tps.cuentas;

import java.util.List;
import java.util.stream.Collectors;

public class Control {
    private List<Cliente> clientes;

    public Cliente buscarCliente(Integer dni)
    {
        return this.clientes
                .stream()
                .filter(cliente -> cliente.getDni() == dni)
                .findFirst()
                .get();
    }
    public List<Cuenta> buscarCuentas(Cliente cliente, Double saldoMayorA)
    {
        return cliente.getCuentas()
                .stream()
                .filter(cuenta -> cuenta.getSaldo() > saldoMayorA)
                .collect(Collectors.toList());
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

}
