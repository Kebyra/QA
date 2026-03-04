public class Homework {
    public static void main(String[] args) {
        System.out.println("=== Задание 1 ===");
        printThreeWords();

        System.out.println("\n=== Задание 2 ===");
        checkSumSign();

        System.out.println("\n=== Задание 3 ===");
        printColor();

        System.out.println("\n=== Задание 4 ===");
        compareNumbers();

        System.out.println("\n=== Задание 5 ===");
        System.out.println("10 и 5: " + isSumInRange(10, 5));
        System.out.println("15 и 10: " + isSumInRange(15, 10));

        System.out.println("\n=== Задание 6 ===");
        printSign(5);
        printSign(-3);
        printSign(0);

        System.out.println("\n=== Задание 7 ===");
        System.out.println("-5: " + isNegative(-5));
        System.out.println("3: " + isNegative(3));
        System.out.println("0: " + isNegative(0));

        System.out.println("\n=== Задание 8 ===");
        printStringMultipleTimes("Hello", 3);

        System.out.println("\n=== Задание 9 ===");
        System.out.println("2000: " + isLeapYear(2000));
        System.out.println("1900: " + isLeapYear(1900));
        System.out.println("2024: " + isLeapYear(2024));

        System.out.println("\n=== Задание 10 ===");
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(binaryArray);
        printArray(binaryArray);

        System.out.println("\n=== Задание 11 ===");
        int[] filledArray = fillArrayWithNumbers(100);
        printArray(filledArray);

        System.out.println("\n=== Задание 12 ===");
        int[] multiplyArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(multiplyArray);
        printArray(multiplyArray);

        System.out.println("\n=== Задание 13 ===");
        int[][] squareArray = new int[8][8];
        fillDiagonals(squareArray);
        print2DArray(squareArray);

        System.out.println("\n=== Задание 14 ===");
        int[] createdArray = createArray(7, 42);
        printArray(createdArray);
    }

    // 1. Печать трёх слов
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Проверка суммы
    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Печать цвета
    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    // 4. Сравнение чисел
    public static void compareNumbers() {
        int a = 7;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Проверка суммы в диапазоне
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6. Печать знака числа
    public static void printSign(int number) {
        if (number >= 0) {
            System.out.println(number + " - положительное");
        } else {
            System.out.println(number + " - отрицательное");
        }
    }

    // 7. Проверка на отрицательность
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8. Печать строки несколько раз
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // 9. Проверка високосного года
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // 10. Замена 0 на 1 и наоборот
    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    // 11. Заполнение массива числами от 1 до 100
    public static int[] fillArrayWithNumbers(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    // 12. Умножение чисел меньше 6 на 2
    public static void multiplyLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    // 13. Заполнение диагоналей двумерного массива
    public static void fillDiagonals(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0; // заполняем нулями для наглядности
            }
        }

        // Заполняем главную диагональ
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }

        // Заполняем побочную диагональ
        for (int i = 0; i < arr.length; i++) {
            arr[i][arr.length - 1 - i] = 1;
        }
    }

    // 14. Создание массива с одинаковыми значениями
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    // Вспомогательный метод для печати одномерного массива
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i % 20 == 19) System.out.println(); // перенос строки каждые 20 чисел
        }
        System.out.println();
    }

    // Вспомогательный метод для печати двумерного массива
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}