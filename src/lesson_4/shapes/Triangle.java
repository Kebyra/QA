package lesson_4.shapes;

import java.awt.Color;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private Color fillColor;
    private Color borderColor;

    public Triangle(double sideA, double sideB, double sideC, Color fillColor, Color borderColor) {
        // Проверка существования треугольника
        if (!isValidTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Треугольник с такими сторонами не существует!");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    @Override
    public double getArea() {
        // Формула Герона
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    public Color getBorderColor() {
        return borderColor;
    }
}