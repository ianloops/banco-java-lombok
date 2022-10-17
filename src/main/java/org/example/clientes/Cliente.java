package org.example.clientes;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@ToString
@Getter
public class Cliente{
    private final String nome;
    private final LocalDate nascimento;

    public Cliente(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

}
