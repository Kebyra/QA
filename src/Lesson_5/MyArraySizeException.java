package Lesson_5;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
        super("Неверный размер массива! Ожидается массив 4x4.");
    }

    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(int rows, int cols) {
        super("Неверный размер массива! Ожидается 4x4, получено " + rows + "x" + cols);
    }
}