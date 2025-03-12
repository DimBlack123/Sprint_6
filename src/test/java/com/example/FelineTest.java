package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    @Test
    void getFamily() {
        assertEquals("Кошачьи", new Feline().getFamily());
    }

    @Test
    void getKittens() {
        assertEquals(1, new Feline().getKittens());
    }

}
