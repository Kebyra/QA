package Lesson_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== ЗАДАНИЕ 1-2: ТОВАРЫ ==========");

        // Создаем массив из 5 товаров
        Product[] productsArray = new Product[5];

        // Заполняем массив объектами
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);

        productsArray[1] = new Product("iPhone 15 Pro", "15.01.2025",
                "Apple Inc.", "USA", 5999, false);

        productsArray[2] = new Product("Xiaomi 14 Ultra", "10.02.2025",
                "Xiaomi Corp.", "China", 3499, true);

        productsArray[3] = new Product("Sony WH-1000XM5", "20.12.2024",
                "Sony Corp.", "Japan", 1299, false);

        productsArray[4] = new Product("MacBook Pro 16", "05.01.2025",
                "Apple Inc.", "USA", 8999, true);

        // Выводим информацию о всех товарах
        System.out.println("\n--- ВСЕ ТОВАРЫ ---");
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("\nТовар #" + (i + 1));
            productsArray[i].printInfo();
        }

        // Выводим только забронированные товары
        System.out.println("\n--- ЗАБРОНИРОВАННЫЕ ТОВАРЫ ---");
        for (Product product : productsArray) {
            if (product.isReserved()) {
                product.printInfo();
                System.out.println();
            }
        }

        System.out.println("\n========== ЗАДАНИЕ 3: ПАРК ==========");

        // Создаем парк с возможностью добавить до 10 аттракционов
        Park dreamPark = new Park("Dream Island", "пр. Победителей, 120", "10:00 - 22:00", 10);

        // Добавляем аттракционы
        dreamPark.addAttraction("Американские горки", "11:00 - 21:00", 15.50);
        dreamPark.addAttraction("Колесо обозрения", "10:00 - 22:00", 12.00);
        dreamPark.addAttraction("Комната страха", "12:00 - 20:00", 10.00);
        dreamPark.addAttraction("Автодром", "11:00 - 21:00", 8.50);
        dreamPark.addAttraction("Водные горки", "12:00 - 19:00", 20.00);

        // Выводим информацию о всех аттракционах
        dreamPark.printAllAttractions();

        // Демонстрация создания аттракциона через внутренний класс
        System.out.println("\n--- ДОПОЛНИТЕЛЬНЫЙ АТТРАКЦИОН ---");
        Park.Attraction extraAttraction = dreamPark.new Attraction("Лабиринт", "10:00 - 18:00", 7.00);
        extraAttraction.printInfo();
    }
}