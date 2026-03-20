package Lesson_5;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== ЗАДАНИЕ 1: ОБРАБОТКА МАССИВА С ИСКЛЮЧЕНИЯМИ ==========\n");

        // Пример 1: Корректный массив 4x4
        System.out.println("--- Пример 1: Корректный массив ---");
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        ArrayProcessor.processArraySafe(correctArray);

        // Пример 2: Массив с некорректными данными
        System.out.println("\n--- Пример 2: Некорректные данные ---");
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "abc", "8"},      // "abc" - не число
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        ArrayProcessor.processArraySafe(invalidDataArray);

        // Пример 3: Массив неверного размера
        System.out.println("\n--- Пример 3: Неверный размер массива ---");
        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        ArrayProcessor.processArraySafe(wrongSizeArray);

        // Пример 4: Пустой массив
        System.out.println("\n--- Пример 4: null массив ---");
        ArrayProcessor.processArraySafe(null);

        // Пример 5: Массив с null строкой
        System.out.println("\n--- Пример 5: null строка в массиве ---");
        String[][] nullRowArray = {
                {"1", "2", "3", "4"},
                null,
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        ArrayProcessor.processArraySafe(nullRowArray);

        // Пример 6: Смешанные корректные данные
        System.out.println("\n--- Пример 6: Смешанные корректные данные (разные числа) ---");
        String[][] mixedCorrectArray = {
                {"10", "20", "30", "40"},
                {"50", "60", "70", "80"},
                {"90", "100", "110", "120"},
                {"130", "140", "150", "160"}
        };
        ArrayProcessor.processArraySafe(mixedCorrectArray);

        // ========== ЧАСТЬ 2: ArrayIndexOutOfBoundsException ==========
        System.out.println("\n========== ЗАДАНИЕ 2: ARRAYINDEXOUTOFBOUNDSEXCEPTION ==========\n");

        demonstrateArrayIndexOutOfBounds();
    }

    /**
     * Метод для демонстрации генерации и обработки ArrayIndexOutOfBoundsException
     */
    public static void demonstrateArrayIndexOutOfBounds() {

        System.out.println("--- Пример 1: Выход за границы массива ---");

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Массив длиной " + numbers.length + ": [1, 2, 3, 4, 5]");

        // Попытка получить доступ к несуществующему индексу
        try {
            System.out.println("Пытаемся получить элемент с индексом 10...");
            int value = numbers[10];
            System.out.println("Значение: " + value); // эта строка не выполнится
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Поймано исключение: " + e.getClass().getSimpleName());
            System.err.println("Сообщение: " + e.getMessage());
            System.err.println("Доступные индексы: от 0 до " + (numbers.length - 1));
        }

        System.out.println("\n--- Пример 2: Обработка нескольких исключений ---");

        // Метод с несколькими операциями, где могут быть исключения
        processArrayWithBoundsCheck(numbers);

        System.out.println("\n--- Пример 3: Безопасный доступ к массиву ---");

        // Безопасный метод для получения элемента
        System.out.println("Элемент с индексом 2: " + safeGet(numbers, 2));
        System.out.println("Элемент с индексом 10: " + safeGet(numbers, 10));
        System.out.println("Элемент с индексом -1: " + safeGet(numbers, -1));
    }

    /**
     * Демонстрация обработки исключений в цикле
     */
    public static void processArrayWithBoundsCheck(int[] array) {
        int[] indices = {0, 2, 5, 1, 10, 3, -1};

        for (int index : indices) {
            try {
                int value = array[index];
                System.out.println("  array[" + index + "] = " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("  array[" + index + "] -> ИСКЛЮЧЕНИЕ! Индекс вне диапазона (0-" + (array.length - 1) + ")");
            }
        }
    }

    /**
     * Безопасное получение элемента массива
     */
    public static String safeGet(int[] array, int index) {
        try {
            return String.valueOf(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Ошибка: индекс " + index + " вне диапазона [0-" + (array.length - 1) + "]";
        }
    }
}