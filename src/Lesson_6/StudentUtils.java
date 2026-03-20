package Lesson_6;

import java.util.*;

public class StudentUtils {

    /**
     * Удаляет студентов со средним баллом < 3
     * @param students коллекция студентов
     * @return количество удаленных студентов
     */
    public static int removePoorStudents(List<Student> students) {
        if (students == null || students.isEmpty()) {
            return 0;
        }

        int removedCount = 0;
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
                removedCount++;
                System.out.println("Удален: " + student.getName() + " (средний балл: " +
                        String.format("%.2f", student.getAverageGrade()) + ")");
            }
        }

        return removedCount;
    }

    /**
     * Переводит студентов на следующий курс, если средний балл >= 3
     * @param students коллекция студентов
     * @return количество переведенных студентов
     */
    public static int promoteStudents(List<Student> students) {
        if (students == null || students.isEmpty()) {
            return 0;
        }

        int promotedCount = 0;

        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.promote();
                promotedCount++;
                System.out.println("Переведен на " + student.getCourse() + " курс: " + student.getName() +
                        " (средний балл: " + String.format("%.2f", student.getAverageGrade()) + ")");
            }
        }

        return promotedCount;
    }

    /**
     * Печатает имена студентов, обучающихся на указанном курсе
     * @param students коллекция студентов
     * @param course номер курса
     */
    public static void printStudents(Set<Student> students, int course) {
        if (students == null || students.isEmpty()) {
            System.out.println("Список студентов пуст");
            return;
        }

        System.out.println("\nСтуденты на " + course + " курсе:");
        boolean found = false;

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("  - " + student.getName() + " (группа: " + student.getGroup() +
                        ", средний балл: " + String.format("%.2f", student.getAverageGrade()) + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("  Студентов на " + course + " курсе не найдено");
        }
    }

    /**
     * Вспомогательный метод для печати всех студентов
     */
    public static void printAllStudents(List<Student> students, String title) {
        System.out.println("\n=== " + title + " ===");
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}