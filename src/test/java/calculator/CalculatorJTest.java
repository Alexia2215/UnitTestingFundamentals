package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorJTest {

    private final Calculator calculatorUT = new Calculator();

    @Test
    public void testSubstract () {
        assertThat(calculatorUT.substract(-2,2))
                .isEqualTo(-4.0);
        assertThat(calculatorUT.substract(2,-2) ==4)
                .isInstanceOf(Boolean.class)
                .isTrue();

    }

    @Test
    public void testDivide() {
        assertThatThrownBy(() -> calculatorUT.divide(2,2))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Divide by zero");
    }
}
