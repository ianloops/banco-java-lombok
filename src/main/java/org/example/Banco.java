package org.example;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;
import org.example.contas.Conta;

import java.util.LinkedList;
import java.util.List;

@ToString
public class Banco {
    @Getter private final String nome;
    @Getter private final List<Conta> contas = new LinkedList<>();

    public Banco(String nome) {
        this.nome = nome;
    }


}
