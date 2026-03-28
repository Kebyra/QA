package Lesson_6;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("========== ЗАДАНИЕ 1: СТУДЕНТЫ ==========\n");
        demonstrateStudents();

        System.out.println("\n\n========== ЗАДАНИЕ 2: ТЕЛЕФОННЫЙ СПРАВОЧНИК ==========\n");
        demonstratePhoneBook();
    }

    // ==================== ЗАДАНИЕ 1: СТУДЕНТЫ ====================

    private static void demonstrateStudents() {
        // Создаем список студентов
        List<Student> students = createStudentList();

        // Выводим начальный список
        printAllStudents(students, "НАЧАЛЬНЫЙ СПИСОК СТУДЕНТОВ");

        // Удаляем студентов со средним баллом < 3
        System.out.println("\n--- УДАЛЕНИЕ СТУДЕНТОВ (средний балл < 3) ---");
        int removed = removePoorStudents(students);
        System.out.println("\nУдалено студентов: " + removed);

        // Выводим список после удаления
        printAllStudents(students, "СПИСОК ПОСЛЕ УДАЛЕНИЯ");

        // Переводим студентов на следующий курс
        System.out.println("\n--- ПЕРЕВОД СТУДЕНТОВ (средний балл >= 3) ---");
        int promoted = promoteStudents(students);
        System.out.println("\nПереведено студентов: " + promoted);

        // Выводим финальный список
        printAllStudents(students, "ФИНАЛЬНЫЙ СПИСОК СТУДЕНТОВ");

        // Демонстрация метода printStudents с Set
        System.out.println("\n--- ДЕМОНСТРАЦИЯ printStudents ---");
        Set<Student> studentSet = new HashSet<>(students);

        printStudents(studentSet, 2);
        printStudents(studentSet, 3);
        printStudents(studentSet, 4);
    }

    /**
     * Создает список студентов для тестирования
     */
    private static List<Student> createStudentList() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иванов Иван", "Группа А", 2,
                Arrays.asList(5, 5, 4, 5, 5)));

        students.add(new Student("Петров Петр", "Группа А", 2,
                Arrays.asList(4, 4, 5, 4, 4)));

        students.add(new Student("Сидоров Сидор", "Группа Б", 2,
                Arrays.asList(3, 3, 4, 3, 3)));

        students.add(new Student("Козлов Козел", "Группа Б", 2,
                Arrays.asList(2, 2, 3, 2, 2)));

        students.add(new Student("Смирнова Анна", "Группа В", 3,
                Arrays.asList(5, 5, 5, 5, 5)));

        students.add(new Student("Кузнецова Мария", "Группа В", 3,
                Arrays.asList(4, 4, 4, 5, 4)));

        students.add(new Student("Новиков Дмитрий", "Группа Г", 3,
                Arrays.asList(2, 2, 2, 3, 2)));

        students.add(new Student("Морозов Алексей", "Группа Д", 4,
                Arrays.asList(3, 3, 3, 3, 3)));

        students.add(new Student("Волкова Екатерина", "Группа Д", 4,
                Arrays.asList(4, 4, 4, 4, 5)));

        return students;
    }

    /**
     * Удаляет студентов со средним баллом < 3
     */
    private static int removePoorStudents(List<Student> students) {
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
     */
    private static int promoteStudents(List<Student> students) {
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
     */
    private static void printStudents(Set<Student> students, int course) {
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
     * Печатает всех студентов
     */
    private static void printAllStudents(List<Student> students, String title) {
        System.out.println("\n=== " + title + " ===");
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // ==================== ЗАДАНИЕ 2: ТЕЛЕФОННЫЙ СПРАВОЧНИК ====================

    private static void demonstratePhoneBook() {
        // Создаем телефонный справочник
        Map<String, List<String>> phoneBook = new HashMap<>();

        // Добавляем записи
        System.out.println("--- ДОБАВЛЕНИЕ ЗАПИСЕЙ ---");
        addPhone(phoneBook, "Иванов", "+375291234567");
        addPhone(phoneBook, "Петров", "+375292345678");
        addPhone(phoneBook, "Сидоров", "+375293456789");
        addPhone(phoneBook, "Иванов", "+375294567890");    // второй телефон для Иванова
        addPhone(phoneBook, "Иванов", "+375295678901");    // третий телефон для Иванова
        addPhone(phoneBook, "Кузнецов", "+375296789012");
        addPhone(phoneBook, "Петров", "+375297890123");    // второй телефон для Петрова

        // Попытка добавить дубликат
        System.out.println("\n--- ПОПЫТКА ДОБАВИТЬ ДУБЛИКАТ ---");
        addPhone(phoneBook, "Иванов", "+375291234567");

        // Выводим весь справочник
        printAllPhones(phoneBook);

        // Поиск телефонов по фамилиям
        System.out.println("--- ПОИСК ТЕЛЕФОНОВ ---");
        getPhones(phoneBook, "Иванов");
        getPhones(phoneBook, "Петров");
        getPhones(phoneBook, "Сидоров");
        getPhones(phoneBook, "Смирнов"); // несуществующая фамилия

        // Статистика
        System.out.println("\n--- СТАТИСТИКА ---");
        int uniqueSurnames = phoneBook.size();
        int totalPhones = 0;
        for (List<String> phones : phoneBook.values()) {
            totalPhones += phones.size();
        }
        System.out.println("Количество записей (уникальных фамилий): " + uniqueSurnames);
        System.out.println("Общее количество телефонов: " + totalPhones);
    }

    /**
     * Добавляет телефон в справочник
     */
    private static void addPhone(Map<String, List<String>> phoneBook, String surname, String phone) {
        if (phoneBook.containsKey(surname)) {
            List<String> phones = phoneBook.get(surname);
            if (!phones.contains(phone)) {
                phones.add(phone);
                System.out.println("Добавлен номер " + phone + " для фамилии " + surname);
            } else {
                System.out.println("Номер " + phone + " уже существует для фамилии " + surname);
            }
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            phoneBook.put(surname, phones);
            System.out.println("Добавлена запись: " + surname + " -> " + phone);
        }
    }

    /**
     * Выводит телефоны по фамилии
     */
    private static void getPhones(Map<String, List<String>> phoneBook, String surname) {
        List<String> phones = phoneBook.get(surname);
        System.out.println("\nТелефоны для фамилии \"" + surname + "\":");
        if (phones == null || phones.isEmpty()) {
            System.out.println("  Телефоны не найдены");
        } else {
            for (int i = 0; i < phones.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + phones.get(i));
            }
        }
    }

    /**
     * Выводит весь справочник
     */
    private static void printAllPhones(Map<String, List<String>> phoneBook) {
        if (phoneBook.isEmpty()) {
            System.out.println("Справочник пуст");
            return;
        }

        System.out.println("\n=== ТЕЛЕФОННЫЙ СПРАВОЧНИК ===");
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("============================\n");
    }
}