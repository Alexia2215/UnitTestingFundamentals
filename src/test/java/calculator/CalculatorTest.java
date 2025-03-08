package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final Calculator calculatorUT = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculatorUT.add(2,3));
        assertEquals(-1.0, calculatorUT.add(-2,1));
        assertEquals(0.0, calculatorUT.add(2,-2));
    }

    @Test
    public void testSubstract() {
        assertEquals(-1, calculatorUT.substract(2,3));
        assertEquals(-3, calculatorUT.substract(-2,1));
        assertEquals(4.0, calculatorUT.substract(2,-2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculatorUT.multiply(2,3));
        assertEquals(-2.0, calculatorUT.multiply(-2,1));
        assertEquals(-4.0, calculatorUT.multiply(2,-2));
    }

    @Test
    public void testDivide() {
        assertEquals(1.5, calculatorUT.divide(3,2));
        assertEquals(-2.0, calculatorUT.divide(-2,1));
        assertEquals(-1.0, calculatorUT.divide(2,-2));

        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculatorUT.divide(1, 0);
        });

    }
}
