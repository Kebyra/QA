package Lesson_7.main;

public class TriangleArea {

    /**
     * Вычисляет площадь треугольника по трём сторонам (формула Герона)
     * @param a длина первой стороны
     * @param b длина второй стороны
     * @param c длина третьей стороны
     * @return площадь треугольника
     * @throws IllegalArgumentException если стороны не образуют треугольник
     */
    public static double calculate(double a, double b, double c) {
        // Проверка на положительность сторон
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны треугольника должны быть положительными");
        }

        // Проверка неравенства треугольника
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Стороны не образуют треугольник");
        }

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}