package Lesson_5;

public class ArrayProcessor {

    private static final int EXPECTED_SIZE = 4;

    /**
     * Метод обрабатывает двумерный строковый массив размером 4x4.
     * Суммирует все элементы, преобразованные в int.
     *
     * @param array входной строковый массив
     * @return сумма всех элементов
     * @throws MyArraySizeException если размер массива не 4x4
     * @throws MyArrayDataException если элемент нельзя преобразовать в int
     */
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        // Проверка размера массива
        if (array == null) {
            throw new MyArraySizeException("Массив равен null!");
        }

        if (array.length != EXPECTED_SIZE) {
            throw new MyArraySizeException(array.length, array.length);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null || array[i].length != EXPECTED_SIZE) {
                throw new MyArraySizeException("Строка " + i + " имеет неверный размер!");
            }
        }

        // Суммирование элементов
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }

        return sum;
    }

    /**
     * Метод для демонстрации работы с безопасной обработкой
     */
    public static void processArraySafe(String[][] array) {
        try {
            int result = processArray(array);
            System.out.println("Сумма всех элементов: " + result);
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Ошибка данных: " + e.getMessage());
            System.err.println("  Ячейка: [" + e.getRow() + "][" + e.getCol() + "]");
            System.err.println("  Значение: \"" + e.getInvalidValue() + "\"");
        }
    }
}