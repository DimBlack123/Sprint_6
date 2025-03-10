package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CatTest {

    @Test
    void getSound() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getCustomSound() {
        Cat cat = Mockito.mock(Cat.class);
        when(cat.getSound()).thenReturn("МяуМяу");
        assertEquals("МяуМяу", cat.getSound());
    }

    @Test
    void getFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

}
