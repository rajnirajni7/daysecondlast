package com.example.unit.testing;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MathServiceTest {

    private final MathService mathService = new MathService();

    @Test
    void testAdd() {
        assertEquals(5, mathService.add(2, 3));
        assertEquals(0, mathService.add(-2, 2));
        assertEquals(-7, mathService.add(-5, -2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, mathService.multiply(2, 3));
        assertEquals(0, mathService.multiply(0, 5));
        assertEquals(-10, mathService.multiply(-2, 5));
    }
}
