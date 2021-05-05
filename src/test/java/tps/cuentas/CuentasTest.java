package tps.cuentas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CuentasTest {
    private Cliente cliente1;
    private Cliente cliente2;

    private Cuenta cuenta1;
    private Cuenta cuenta2;
    private Cuenta cuenta3;

    private Control control;

    @Before
    public void init()
    {
        this.control = new Control();
        this.cliente1 = new Cliente();
        this.cliente2 = new Cliente();
        this.cuenta1 = new Cuenta();
        this.cuenta2 = new Cuenta();
        this.cuenta3 = new Cuenta();

        this.cuenta1.setSaldo(800.0);
        this.cuenta2.setSaldo(500.0);
        this.cuenta3.setSaldo(600.0);

        this.cliente1.setDni(123);

        List<Cuenta> cuentas1 = new ArrayList<>();
        cuentas1.add(this.cuenta1);

        this.cliente1.setCuentas(cuentas1);

        this.cliente2.setDni(321);

        List<Cuenta> cuentas2 = new ArrayList<>();
        cuentas2.add(this.cuenta2);
        cuentas2.add(this.cuenta3);

        this.cliente2.setCuentas(cuentas2);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        this.control.setClientes(clientes);
    }

    @Test
    public void cuentasCliente1()
    {
        Double saldoMayorA = 550.0;
        Cliente cliente1 = this.control.buscarCliente(123);

        Long cantidadDeCuentas = cliente1.getCuentas().stream().count();
        Long cantidadDeCuentasDeMayorSaldo = this.control.buscarCuentas(cliente1, saldoMayorA).stream().count();

        Assert.assertEquals(1, (long) cantidadDeCuentas);
        Assert.assertEquals(1, (long) cantidadDeCuentasDeMayorSaldo);
    }

    @Test
    public void cuentasCliente2()
    {
        Double saldoMayorA = 550.0;
        Cliente cliente2 = this.control.buscarCliente(321);

        Long cantidadDeCuentas = cliente2.getCuentas().stream().count();
        Long cantidadDeCuentasDeMayorSaldo = this.control.buscarCuentas(cliente2, saldoMayorA).stream().count();

        Assert.assertEquals(2, (long) cantidadDeCuentas);
        Assert.assertEquals(1, (long) cantidadDeCuentasDeMayorSaldo);
    }
}
