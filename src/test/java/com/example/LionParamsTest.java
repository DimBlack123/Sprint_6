package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LionParamsTest {

    static Stream<Arguments> data() {
        return Stream.of(
                arguments("Самец", true),
                arguments("Самка", false)
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    void doesHaveMane(String sex, boolean expectedResult) throws Exception {
        assertEquals(expectedResult, new Lion(sex, new Feline()).doesHaveMane());
    }

}
