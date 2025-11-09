package org.example.calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {

    @Test
    void add() {
        assertEquals(3.0, new Calculator(1, 2, '+').evaluate(), 1e-9);
    }

    @Test
    void sub() {
        assertEquals(3.0, new Calculator(5, 2, '-').evaluate(), 1e-9);
    }

    @Test
    void mul() {
        assertEquals(12.0, new Calculator(3, 4, '*').evaluate(), 1e-9);
    }

    @Test
    void div() {
        assertEquals(5.0, new Calculator(10, 2, '/').evaluate(), 1e-9);
    }

    @Test
    void divByZero() {
        assertThrows(ArithmeticException.class, () -> new Calculator(1, 0, '/').evaluate());
    }

    @Test
    void invalidOp() {
        assertThrows(IllegalArgumentException.class, () -> new Calculator(1, 2, '%').evaluate());
    }
}
