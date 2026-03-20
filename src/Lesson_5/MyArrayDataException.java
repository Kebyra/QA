package Lesson_5;

public class MyArrayDataException extends Exception {

    private int row;
    private int col;
    private String invalidValue;

    public MyArrayDataException(int row, int col, String invalidValue) {
        super("Ошибка преобразования в ячейке [" + row + "][" + col + "]: \"" + invalidValue + "\" не является числом!");
        this.row = row;
        this.col = col;
        this.invalidValue = invalidValue;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getInvalidValue() {
        return invalidValue;
    }
}