package Lesson_7.test.testng;

import Lesson_7.main.Factorial;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class FactorialTestNG {

    @Test
    public void testFactorialZero() {
        assertEquals(Factorial.calculate(0), 1);
    }

    @Test
    public void testFactorialOne() {
        assertEquals(Factorial.calculate(1), 1);
    }

    @Test
    public void testFactorialFive() {
        assertEquals(Factorial.calculate(5), 120);
    }

    @Test
    public void testFactorialTen() {
        assertEquals(Factorial.calculate(10), 3628800L);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Factorial.calculate(-5);
    }
}