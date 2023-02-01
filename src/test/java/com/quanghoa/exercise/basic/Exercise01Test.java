package com.quanghoa.exercise.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise01Test {

    @Test
    void shouldSubtract_OK() {
        assertEquals(3, new Exercise01().subtract(7, 4));
        assertEquals(3, new Exercise01().subtract(8, 5));
    }
}