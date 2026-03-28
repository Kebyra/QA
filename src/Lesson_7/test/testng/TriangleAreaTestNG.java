package Lesson_7.test.testng;

import Lesson_7.main.TriangleArea;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class TriangleAreaTestNG {

    @Test
    public void testRightTriangle() {
        assertEquals(TriangleArea.calculate(3, 4, 5), 6.0, 0.0001);
    }

    @Test
    public void testEquilateralTriangle() {
        double expected = (Math.sqrt(3) / 4) * 36;
        assertEquals(TriangleArea.calculate(6, 6, 6), expected, 0.0001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidTriangle() {
        TriangleArea.calculate(1, 1, 3);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeSide() {
        TriangleArea.calculate(-1, 2, 2);
    }
}