package lesson_4.animals;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== ЗАДАНИЕ 1: ЖИВОТНЫЕ ==========");

        // Создаем животных
        Dog jesse = new Dog("Джесси");
        Dog busya = new Dog("Буся");
        Cat johnny = new Cat("Джонни");
        Cat bonya = new Cat("Боня");
        Cat pushok = new Cat("Пушок");

        // Тестируем бег и плавание
        System.out.println("\n--- Тестирование движений ---");
        jesse.run(450);
        jesse.run(600);
        jesse.swim(8);
        jesse.swim(12);

        johnny.run(150);
        johnny.run(250);
        johnny.swim(5);

        // Выводим статистику
        System.out.println("\n--- Статистика ---");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Animal.getDogCount());
        System.out.println("Котов: " + Animal.getCatCount());

        // Часть 2: Коты и миска
        System.out.println("\n========== ЧАСТЬ 2: КОТЫ И МИСКА ==========");

        // Создаем миску с едой
        Bowl bowl = new Bowl(30);
        bowl.info();

        // Создаем массив котов
        Cat[] cats = {
                new Cat("Сэм"),
                new Cat("Барс"),
                new Cat("Черныш"),
                new Cat("Матроскин"),
                new Cat("Васька")
        };

        // Массив аппетитов котов
        int[] appetites = {15, 10, 20, 5, 8};

        // Коты пытаются покушать (первый раунд)
        System.out.println("\n--- Коты обедают (первый раз) ---");
        for (int i = 0; i < cats.length; i++) {
            System.out.print(cats[i].getName() + " хочет " + appetites[i] + ": ");
            cats[i].eat(bowl, appetites[i]);
        }

        // Проверяем сытость котов после первого раунда
        System.out.println("\n--- Результаты первого обеда ---");
        bowl.info();
        System.out.println("\nСостояние котов:");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " (" + appetites[i] + "): " +
                    (cats[i].isFull() ? "сыт 😊" : "голоден 😿"));
        }

        // Добавляем еду в миску
        System.out.println("\n--- Добавляем еду ---");
        bowl.addFood(25);
        bowl.info();

        // Голодные коты пробуют снова (второй раунд)
        System.out.println("\n--- Вторая попытка для голодных котов ---");
        for (int i = 0; i < cats.length; i++) {
            if (!cats[i].isFull()) {
                System.out.print(cats[i].getName() + " хочет " + appetites[i] + ": ");
                cats[i].eat(bowl, appetites[i]);
            }
        }

        // Финальный результат
        System.out.println("\n--- Финальное состояние ---");
        bowl.info();
        System.out.println("\nСостояние котов:");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " (" + appetites[i] + "): " +
                    (cats[i].isFull() ? "сыт 😊" : "голоден 😿"));
        }
    }
}