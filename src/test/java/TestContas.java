import org.example.Banco;
import org.example.clientes.Cliente;
import org.example.contas.Conta;
import org.example.contas.ContaCorrente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TestContas {
    Conta conta1 = new ContaCorrente(new Cliente("abc", LocalDate.now()), new Banco("banco1"));
    Conta conta2 = new ContaCorrente(new Cliente("def", LocalDate.now()), new Banco("banco2"));

    @BeforeEach
    void init(){
        conta1.depositar(1000.0);
    }

    @Test
    void DepositarTest(){
        conta1.depositar(1000.0);
        assertEquals(2000.0, conta1.getSaldo());
    }

    @Test
    void SacarTest(){
        conta1.sacar(1001d);
        assertEquals(1000d, conta1.getSaldo());
        conta1.sacar(500d);
        assertEquals(500d, conta1.getSaldo());
    }

    @Test
    void TransferirTest(){
        conta1.transferir(2000d, conta2);
        assertAll(
                () -> assertEquals(1000d, conta1.getSaldo()),
                () -> assertEquals(0d, conta2.getSaldo())
        );
        conta1.transferir(1000d, conta2);
        assertAll(
                ()->assertEquals(0d, conta1.getSaldo()),
                ()->assertEquals(1000d, conta2.getSaldo())
        );
    }
}
