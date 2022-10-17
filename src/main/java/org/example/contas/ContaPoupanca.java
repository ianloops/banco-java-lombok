package org.example.contas;

import org.example.Banco;
import org.example.clientes.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }
}
