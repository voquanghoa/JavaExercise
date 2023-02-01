package com.quanghoa.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise01Test {

    @Test
    void shouldSubtract_OK() {
        final var exercise01 = new Exercise01();

        assertEquals(3, exercise01.subtract(7, 4));
        assertEquals(3, exercise01.subtract(8, 5));
    }
}