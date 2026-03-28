package Lesson_6;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }

    // Метод для расчета среднего балла
    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Метод для перевода на следующий курс
    public void promote() {
        course++;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades); // возвращаем копию для защиты
    }

    // Метод для вывода информации о студенте
    @Override
    public String toString() {
        return String.format("Студент: %s | Группа: %s | Курс: %d | Средний балл: %.2f | Оценки: %s",
                name, group, course, getAverageGrade(), grades);
    }
}