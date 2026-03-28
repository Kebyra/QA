package Lesson_7.test.junit5;

import Lesson_7.main.Factorial;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    @DisplayName("Факториал 0 должен быть 1")
    void testFactorialZero() {
        assertEquals(1, Factorial.calculate(0));
    }

    @Test
    @DisplayName("Факториал 1 должен быть 1")
    void testFactorialOne() {
        assertEquals(1, Factorial.calculate(1));
    }

    @Test
    @DisplayName("Факториал 5 должен быть 120")
    void testFactorialFive() {
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    @DisplayName("Факториал 10 должен быть 3628800")
    void testFactorialTen() {
        assertEquals(3628800, Factorial.calculate(10));
    }

    @Test
    @DisplayName("Факториал отрицательного числа должен выбрасывать исключение")
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculate(-5);
        });
    }
}