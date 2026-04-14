package com.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Should add two positive numbers correctly")
    void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(-3, 3));
        assertEquals(-6, calculator.add(-3, -3));
    }

    @Test
    @DisplayName("Should subtract two numbers correctly")
    void testSubtract() {
        assertEquals(6, calculator.subtract(10, 4));
        assertEquals(-1, calculator.subtract(0, 1));
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    @DisplayName("Should multiply two numbers correctly")
    void testMultiply() {
        assertEquals(42, calculator.multiply(6, 7));
        assertEquals(0, calculator.multiply(0, 100));
        assertEquals(-12, calculator.multiply(-3, 4));
    }

    @Test
    @DisplayName("Should divide two numbers correctly")
    void testDivide() {
        assertEquals(5.0, calculator.divide(20, 4));
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    @DisplayName("Should throw ArithmeticException when dividing by zero")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
