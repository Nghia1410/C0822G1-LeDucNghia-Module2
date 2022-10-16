package ss8_clean_code_and_refactoring.practice.renaming_variables_and_separating_constants_target;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstOperator = 1;
        int secondOperator = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperator, secondOperator, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int firstOperator = 2;
        int secondOperator = 1;
        char operator = '-';
        int expected = 1;

        int result = Calculator.calculate(firstOperator, secondOperator, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int firstOperator = 2;
        int secondOperator = 2;
        char operator = '*';
        int expected = 4;

        int result = Calculator.calculate(firstOperator, secondOperator, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int firstOperator = 6;
        int secondOperator = 3;
        char operator = '/';
        int expected = 2;

        int result = Calculator.calculate(firstOperator, secondOperator, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int firstOperator = 2;
        int secondOperator = 0;
        char operator = '/';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperator, secondOperator, operator);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int firstOperator = 2;
        int secondOperator = 0;
        char operator = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperator, secondOperator, operator);});
    }
}