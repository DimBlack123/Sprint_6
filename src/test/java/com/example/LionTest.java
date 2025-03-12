package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LionTest {

    @Test
    void getKittens() throws Exception {
        assertEquals(1, new Lion("Самец", new Feline()).getKittens());
    }

    @Test
    void getException() {
        assertThrows(Exception.class, () -> new Lion("И не самец и не самка", new Feline()));
    }

    @Test
    void getFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), new Lion("Самец", new Feline()).getFood());
    }

}
