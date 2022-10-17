package org.example.contas;

import lombok.Getter;
import lombok.ToString;
import org.example.Banco;
import org.example.clientes.Cliente;

@ToString()
@Getter
public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected Double saldo = 0d;
    protected int agencia;
    protected int numero;
    protected Cliente cliente;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        banco.getContas().add(this);
    }

    public Conta(Cliente cliente, Banco banco, Double saldo) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        banco.getContas().add(this);
        this.saldo=saldo;
    }

    @Override
    public void sacar(Double valor) {
        if(this.saldo>=valor) this.saldo-=valor;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo+=valor;
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        if(this.saldo>=valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }
}

