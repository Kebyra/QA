package Lesson_7.test.testng;

import Lesson_7.main.ArithmeticCalculator;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class ArithmeticCalculatorTestNG {

    @Test
    public void testAdd() {
        assertEquals(ArithmeticCalculator.add(2, 3), 5);
        assertEquals(ArithmeticCalculator.add(2, -3), -1);
        assertEquals(ArithmeticCalculator.add(0, 0), 0);
    }

    @Test
    public void testSubtract() {
        assertEquals(ArithmeticCalculator.subtract(2, 3), -1);
        assertEquals(ArithmeticCalculator.subtract(2, -3), 5);
        assertEquals(ArithmeticCalculator.subtract(5, 5), 0);
    }

    @Test
    public void testMultiply() {
        assertEquals(ArithmeticCalculator.multiply(2, 3), 6);
        assertEquals(ArithmeticCalculator.multiply(2, -3), -6);
        assertEquals(ArithmeticCalculator.multiply(5, 0), 0);
    }

    @Test
    public void testDivide() {
        assertEquals(ArithmeticCalculator.divide(6, 3), 2.0, 0.0001);
        assertEquals(ArithmeticCalculator.divide(6, -3), -2.0, 0.0001);
        assertEquals(ArithmeticCalculator.divide(5, 2), 2.5, 0.0001);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        ArithmeticCalculator.divide(5, 0);
    }

    @DataProvider(name = "addData")
    public Object[][] addData() {
        return new Object[][] {
                {1, 1, 2},
                {2, 3, 5},
                {10, -5, 5},
                {0, 0, 0}
        };
    }

    @Test(dataProvider = "addData")
    public void testAddParameterized(int a, int b, int expected) {
        assertEquals(ArithmeticCalculator.add(a, b), expected);
    }
}