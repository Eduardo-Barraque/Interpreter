package Interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesourariaTest {
    @Test
    void deveCalcularLucro() {
        Tesouraria tesouraria = new Tesouraria();
        tesouraria.setReceita(10000.0);
        tesouraria.setCusto(5000.0);

        assertEquals(5000.0, tesouraria.calcularLucro());
    }
    @Test
    void deveCalcularMargemLucro() {
        Tesouraria tesouraria = new Tesouraria();
        tesouraria.setLucro(5000.0);
        tesouraria.setReceita(10000.0);

        assertEquals(50.0, tesouraria.calcularMargemLucro());
    }

}
