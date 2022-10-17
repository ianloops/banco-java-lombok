package org.example.clientes;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true)
@Getter
public class ClientePJ extends Cliente{
    private final String cnpj;

    public ClientePJ(String nome, LocalDate nascimento, String cnpj) {
        super(nome, nascimento);
        this.cnpj = cnpj;
    }
}
