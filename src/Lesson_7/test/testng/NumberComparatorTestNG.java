package Lesson_7.test.testng;

import Lesson_7.main.NumberComparator;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class NumberComparatorTestNG {

    @Test
    public void testCompareGreater() {
        assertEquals(NumberComparator.compare(5, 3), 1);
        assertTrue(NumberComparator.isGreater(5, 3));
        assertFalse(NumberComparator.isLess(5, 3));
        assertFalse(NumberComparator.isEqual(5, 3));
    }

    @Test
    public void testCompareLess() {
        assertEquals(NumberComparator.compare(3, 5), -1);
        assertFalse(NumberComparator.isGreater(3, 5));
        assertTrue(NumberComparator.isLess(3, 5));
        assertFalse(NumberComparator.isEqual(3, 5));
    }

    @Test
    public void testCompareEqual() {
        assertEquals(NumberComparator.compare(5, 5), 0);
        assertFalse(NumberComparator.isGreater(5, 5));
        assertFalse(NumberComparator.isLess(5, 5));
        assertTrue(NumberComparator.isEqual(5, 5));
    }

    @Test
    public void testCompareWithZero() {
        assertEquals(NumberComparator.compare(10, 0), 1);
        assertEquals(NumberComparator.compare(-5, 0), -1);
        assertEquals(NumberComparator.compare(0, 0), 0);
    }
}