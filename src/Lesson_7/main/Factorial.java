package Lesson_7.main;

public class Factorial {

    /**
     * Вычисляет факториал числа n (n!)
     * @param n целое неотрицательное число
     * @return факториал числа n
     * @throws IllegalArgumentException если n < 0
     */
    public static long calculate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определён только для неотрицательных чисел");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}