package calc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(5.0, Calculator.add(2, 3), "return 5");
        assertEquals(-1.0, Calculator.add(-2, 1), "return -1");
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, Calculator.subtract(3, 2), "return 1");
        assertEquals(-3.0, Calculator.subtract(-2, 1), "return -3");
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, Calculator.multiply(2, 3), "return 6");
        assertEquals(-2.0, Calculator.multiply(-1, 2), "gave -2");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, Calculator.divide(6, 3), "gave 2");
        assertEquals(-2.0, Calculator.divide(-6, 3), "gave -2");
        assertEquals(0.0, Calculator.divide(0, 3), "division of 0 should return 0");
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(1, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
