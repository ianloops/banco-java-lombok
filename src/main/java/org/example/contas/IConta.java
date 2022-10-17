package org.example.contas;

public interface IConta {
    void sacar(Double valor);
    void transferir(Double valor, Conta contaDestino);
    void depositar(Double valor);
}
