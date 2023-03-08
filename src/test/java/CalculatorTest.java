import org.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    @Test
    void shouldReturnTwoWhenOneAndOneAreGivenForAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 1);
        assertEquals(2,result);
    }

    @Test
    void ShouldReturnFourWhenNineAndFiveAreGivenForSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(9, 5);
        assertEquals(4,result);

    }

    @Test
    void ShouldReturnNegativeOneForOneAndTwoGivenForSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 2);
        assertEquals(-1,result);
    }

    @Test
    void ShouldReturnFourForTwoAndTwo() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 2);
        assertEquals(4,result);
    }

    @Test
    void ShouldReturnZeroForDividingWithZero() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(4, 0);
        assertEquals(0,result);
        assertNotNull(calculator.message);
    }
}

