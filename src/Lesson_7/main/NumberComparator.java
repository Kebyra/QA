package Lesson_7.main;

public class NumberComparator {

    /**
     * Сравнивает два целых числа
     * @param a первое число
     * @param b второе число
     * @return 1 если a > b, 0 если a == b, -1 если a < b
     */
    public static int compare(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a == b) {
            return 0;
        } else {
            return -1;
        }
    }

    /**
     * Проверяет, равно ли a больше b
     */
    public static boolean isGreater(int a, int b) {
        return a > b;
    }

    /**
     * Проверяет, равно ли a меньше b
     */
    public static boolean isLess(int a, int b) {
        return a < b;
    }

    /**
     * Проверяет, равны ли числа
     */
    public static boolean isEqual(int a, int b) {
        return a == b;
    }
}