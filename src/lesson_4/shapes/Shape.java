package lesson_4.shapes;

import java.awt.Color;

public interface Shape {
    // Абстрактные методы (должны быть реализованы)
    double getArea();
    Color getFillColor();
    Color getBorderColor();

    // Default метод для периметра (может быть переопределен)
    default double getPerimeter() {
        return 0; // базовая реализация, будет переопределена
    }

    // Default метод для вывода информации
    default void printInfo() {
        System.out.println("=== " + getClass().getSimpleName() + " ===");
        System.out.println("Площадь: " + String.format("%.2f", getArea()));
        System.out.println("Периметр: " + String.format("%.2f", getPerimeter()));
        System.out.println("Цвет заливки: " + getColorName(getFillColor()));
        System.out.println("Цвет границ: " + getColorName(getBorderColor()));
        System.out.println();
    }

    // Вспомогательный метод для конвертации Color в строку
    private String getColorName(Color color) {
        if (color.equals(Color.RED)) return "Красный";
        if (color.equals(Color.GREEN)) return "Зеленый";
        if (color.equals(Color.BLUE)) return "Синий";
        if (color.equals(Color.YELLOW)) return "Желтый";
        if (color.equals(Color.BLACK)) return "Черный";
        if (color.equals(Color.WHITE)) return "Белый";
        if (color.equals(Color.ORANGE)) return "Оранжевый";
        if (color.equals(Color.MAGENTA)) return "Пурпурный";
        if (color.equals(Color.CYAN)) return "Голубой";
        if (color.equals(Color.PINK)) return "Розовый";
        return "Неизвестный";
    }
}