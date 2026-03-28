package Lesson_7.test.junit5;

import Lesson_7.main.ArithmeticCalculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticCalculatorTest {

    @Test
    @DisplayName("Сложение")
    void testAdd() {
        assertEquals(5, ArithmeticCalculator.add(2, 3));
        assertEquals(-1, ArithmeticCalculator.add(2, -3));
        assertEquals(0, ArithmeticCalculator.add(0, 0));
    }

    @Test
    @DisplayName("Вычитание")
    void testSubtract() {
        assertEquals(-1, ArithmeticCalculator.subtract(2, 3));
        assertEquals(5, ArithmeticCalculator.subtract(2, -3));
        assertEquals(0, ArithmeticCalculator.subtract(5, 5));
    }

    @Test
    @DisplayName("Умножение")
    void testMultiply() {
        assertEquals(6, ArithmeticCalculator.multiply(2, 3));
        assertEquals(-6, ArithmeticCalculator.multiply(2, -3));
        assertEquals(0, ArithmeticCalculator.multiply(5, 0));
    }

    @Test
    @DisplayName("Деление")
    void testDivide() {
        assertEquals(2.0, ArithmeticCalculator.divide(6, 3), 0.0001);
        assertEquals(-2.0, ArithmeticCalculator.divide(6, -3), 0.0001);
        assertEquals(2.5, ArithmeticCalculator.divide(5, 2), 0.0001);
    }

    @Test
    @DisplayName("Деление на ноль")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            ArithmeticCalculator.divide(5, 0);
        });
    }

    @ParameterizedTest
    @DisplayName("Параметризованный тест сложения")
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5",
            "10, -5, 5",
            "0, 0, 0"
    })
    void testAddParameterized(int a, int b, int expected) {
        assertEquals(expected, ArithmeticCalculator.add(a, b));
    }
}