package lesson_4.shapes;

import java.awt.Color;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private Color fillColor;
    private Color borderColor;

    public Rectangle(double width, double height, Color fillColor, Color borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
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