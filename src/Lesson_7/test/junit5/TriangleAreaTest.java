package Lesson_7.test.junit5;

import Lesson_7.main.TriangleArea;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

    @Test
    @DisplayName("Площадь прямоугольного треугольника 3-4-5")
    void testRightTriangle() {
        assertEquals(6.0, TriangleArea.calculate(3, 4, 5), 0.0001);
    }

    @Test
    @DisplayName("Площадь равностороннего треугольника со стороной 6")
    void testEquilateralTriangle() {
        double expected = (Math.sqrt(3) / 4) * 36;
        assertEquals(expected, TriangleArea.calculate(6, 6, 6), 0.0001);
    }

    @Test
    @DisplayName("Стороны не образуют треугольник")
    void testInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleArea.calculate(1, 1, 3);
        });
    }

    @Test
    @DisplayName("Отрицательная сторона")
    void testNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> {
            TriangleArea.calculate(-1, 2, 2);
        });
    }
}