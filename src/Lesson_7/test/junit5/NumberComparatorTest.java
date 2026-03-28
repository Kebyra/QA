package Lesson_7.test.junit5;

import Lesson_7.main.NumberComparator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {

    @Test
    @DisplayName("Сравнение: a > b")
    void testCompareGreater() {
        assertEquals(1, NumberComparator.compare(5, 3));
        assertTrue(NumberComparator.isGreater(5, 3));
        assertFalse(NumberComparator.isLess(5, 3));
        assertFalse(NumberComparator.isEqual(5, 3));
    }

    @Test
    @DisplayName("Сравнение: a < b")
    void testCompareLess() {
        assertEquals(-1, NumberComparator.compare(3, 5));
        assertFalse(NumberComparator.isGreater(3, 5));
        assertTrue(NumberComparator.isLess(3, 5));
        assertFalse(NumberComparator.isEqual(3, 5));
    }

    @Test
    @DisplayName("Сравнение: a == b")
    void testCompareEqual() {
        assertEquals(0, NumberComparator.compare(5, 5));
        assertFalse(NumberComparator.isGreater(5, 5));
        assertFalse(NumberComparator.isLess(5, 5));
        assertTrue(NumberComparator.isEqual(5, 5));
    }

    @Test
    @DisplayName("Сравнение с нулём")
    void testCompareWithZero() {
        assertEquals(1, NumberComparator.compare(10, 0));
        assertEquals(-1, NumberComparator.compare(-5, 0));
        assertEquals(0, NumberComparator.compare(0, 0));
    }
}