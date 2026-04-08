package com.devops.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
<<<<<<< HEAD
    void testSubtract() {

        assertEquals(5, calculator.subtract(10,5));

=======
    void testMultiply() {
        assertEquals(20, calculator.multiply(4,5));
>>>>>>> 223c26b7f42cf0b7cab9f4462ae39e1b3cbcb1e2
    }
}