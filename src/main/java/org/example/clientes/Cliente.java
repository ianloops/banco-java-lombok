package org.example.clientes;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@ToString
public class Cliente implements ICliente{
    @Getter private final String nome;
    @Getter private final LocalDate nascimento;

    public Cliente(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    @Override
    public int getIdade() {
        return (int) nascimento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
}
