package com.devops.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testSubtract() {
        // For Part B (Gradle), we are testing subtraction
        assertEquals(5, calculator.subtract(10, 5));
    }
}