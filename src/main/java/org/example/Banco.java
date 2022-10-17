package org.example;

import lombok.Getter;
import lombok.ToString;
import org.example.contas.Conta;

import java.util.LinkedList;
import java.util.List;

@ToString
@Getter
public class Banco {
    private final String nome;
    private final List<Conta> contas = new LinkedList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

}