package org.example.clientes;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true)
@Getter
public class ClientePF extends Cliente{
    private final String cpf;

    public ClientePF(String nome, LocalDate nascimento, String cpf) {
        super(nome, nascimento);
        this.cpf = cpf;
    }
}
