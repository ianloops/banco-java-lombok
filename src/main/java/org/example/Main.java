package org.example;

import org.example.clientes.Cliente;
import org.example.clientes.ClientePF;
import org.example.clientes.ClientePJ;
import org.example.contas.Conta;
import org.example.contas.ContaCorrente;
import org.example.contas.ContaPoupanca;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco de Juazeiro");
        Cliente ian = new ClientePF("Ian", LocalDate.of(1997, 1, 27), "12345678910");
        Cliente ipv = new ClientePJ("ipv solucoes", LocalDate.of(2009, 2, 1), "132546000180");

        Conta contaIan = new ContaPoupanca(ian, banco);
        Conta contaIpv = new ContaCorrente(ipv, banco);
        contaIpv.depositar(10000d);
        contaIpv.transferir(1000d, contaIan);

        System.out.println(banco+"\n");
        System.out.println(contaIan);
        System.out.println(contaIpv);
        System.out.println(ipv);
    }
}