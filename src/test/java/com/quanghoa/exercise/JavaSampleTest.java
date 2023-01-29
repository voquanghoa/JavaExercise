package com.quanghoa.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaSampleTest {

    @Test
    void shouldSum_OK() {
        final var javaSample = new JavaSample();

        assertEquals(5, javaSample.sum(2, 3));
        assertEquals(7, javaSample.sum(4, 3));
    }
}