package org.example.clientes;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true)
public class ClientePF extends Cliente{
    @Getter private final String cpf;

    public ClientePF(String nome, LocalDate nascimento, String cpf) {
        super(nome, nascimento);
        this.cpf = cpf;
    }
}
