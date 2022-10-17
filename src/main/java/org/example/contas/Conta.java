package org.example.contas;

import lombok.Getter;
import lombok.ToString;
import org.example.Banco;
import org.example.clientes.Cliente;

@ToString()
public abstract class Conta implements IConta{
    @Getter private static final int AGENCIA_PADRAO = 1;
    @Getter private static int SEQUENCIAL = 1;

    @Getter protected Double saldo = 0d;
    @Getter protected int agencia;
    @Getter protected int numero;
    @Getter protected Cliente cliente;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        banco.getContas().add(this);
    }

    @Override
    public void sacar(Double valor) {
        if(this.saldo>valor) this.saldo-=valor;
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        if(this.saldo>valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void depositar(Double valor) {
        this.saldo+=valor;
    }
}

