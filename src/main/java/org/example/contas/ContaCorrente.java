package org.example.contas;

import org.example.Banco;
import org.example.clientes.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }
}
