package Lesson_6;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneMap;

    public PhoneBook() {
        this.phoneMap = new HashMap<>();
    }

    /**
     * Добавляет телефонный номер по фамилии
     * @param surname фамилия
     * @param phone телефонный номер
     */
    public void add(String surname, String phone) {
        // Проверяем, есть ли уже такая фамилия в справочнике
        if (phoneMap.containsKey(surname)) {
            // Если есть, добавляем номер в существующий список
            List<String> phones = phoneMap.get(surname);
            if (!phones.contains(phone)) {
                phones.add(phone);
                System.out.println("Добавлен номер " + phone + " для фамилии " + surname);
            } else {
                System.out.println("Номер " + phone + " уже существует для фамилии " + surname);
            }
        } else {
            // Если фамилии нет, создаем новый список и добавляем номер
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            phoneMap.put(surname, phones);
            System.out.println("Добавлена запись: " + surname + " -> " + phone);
        }
    }

    /**
     * Возвращает список телефонов по фамилии
     * @param surname фамилия
     * @return список телефонов или пустой список, если фамилия не найдена
     */
    public List<String> get(String surname) {
        return phoneMap.getOrDefault(surname, new ArrayList<>());
    }

    /**
     * Выводит все телефоны по фамилии в консоль
     * @param surname фамилия
     */
    public void printPhones(String surname) {
        List<String> phones = get(surname);
        if (phones.isEmpty()) {
            System.out.println("Телефоны для фамилии \"" + surname + "\" не найдены");
        } else {
            System.out.println("Телефоны для фамилии \"" + surname + "\":");
            for (int i = 0; i < phones.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + phones.get(i));
            }
        }
    }

    /**
     * Выводит весь справочник в консоль
     */
    public void printAll() {
        if (phoneMap.isEmpty()) {
            System.out.println("Справочник пуст");
            return;
        }

        System.out.println("\n=== ТЕЛЕФОННЫЙ СПРАВОЧНИК ===");
        for (Map.Entry<String, List<String>> entry : phoneMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("============================\n");
    }

    /**
     * Возвращает количество записей в справочнике
     */
    public int size() {
        return phoneMap.size();
    }

    /**
     * Возвращает общее количество телефонов
     */
    public int totalPhonesCount() {
        int count = 0;
        for (List<String> phones : phoneMap.values()) {
            count += phones.size();
        }
        return count;
    }
}