package lesson_4.shapes;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== ЗАДАНИЕ 2: ГЕОМЕТРИЧЕСКИЕ ФИГУРЫ ==========\n");

        // Создаем массив фигур
        Shape[] shapes = {
                new Circle(5, Color.RED, Color.BLACK),
                new Circle(10, Color.BLUE, Color.WHITE),

                new Rectangle(4, 6, Color.GREEN, Color.BLACK),
                new Rectangle(8, 3, Color.YELLOW, Color.RED),

                new Triangle(3, 4, 5, Color.ORANGE, Color.BLUE),
                new Triangle(6, 6, 6, Color.MAGENTA, Color.CYAN)
        };

        // Выводим информацию о каждой фигуре
        for (Shape shape : shapes) {
            shape.printInfo();
        }

        // Дополнительно: найдем фигуру с максимальной площадью
        Shape maxAreaShape = shapes[0];
        for (Shape shape : shapes) {
            if (shape.getArea() > maxAreaShape.getArea()) {
                maxAreaShape = shape;
            }
        }

        System.out.println("=== ФИГУРА С МАКСИМАЛЬНОЙ ПЛОЩАДЬЮ ===");
        maxAreaShape.printInfo();

        // Дополнительно: фигура с максимальным периметром
        Shape maxPerimeterShape = shapes[0];
        for (Shape shape : shapes) {
            if (shape.getPerimeter() > maxPerimeterShape.getPerimeter()) {
                maxPerimeterShape = shape;
            }
        }

        System.out.println("=== ФИГУРА С МАКСИМАЛЬНЫМ ПЕРИМЕТРОМ ===");
        maxPerimeterShape.printInfo();

        // Демонстрация работы с конкретным типом
        System.out.println("=== РАСЧЕТЫ ДЛЯ ТРЕУГОЛЬНИКА ===");
        Triangle triangle = (Triangle) shapes[4];
        System.out.println("Стороны: 3, 4, 5");
        System.out.println("Проверка: это прямоугольный треугольник? " +
                (Math.abs(3*3 + 4*4 - 5*5) < 0.0001 ? "Да" : "Нет"));
    }
}