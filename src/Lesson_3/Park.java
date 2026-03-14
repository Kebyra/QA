package Lesson_3;

public class Park {
    private String name;
    private String address;
    private String workingHours;
    private Attraction[] attractions;
    private int attractionCount;

    public Park(String name, String address, String workingHours, int maxAttractions) {
        this.name = name;
        this.address = address;
        this.workingHours = workingHours;
        this.attractions = new Attraction[maxAttractions];
        this.attractionCount = 0;
    }

    public void addAttraction(String name, String workingHours, double price) {
        if (attractionCount < attractions.length) {
            attractions[attractionCount] = new Attraction(name, workingHours, price);
            attractionCount++;
            System.out.println("Аттракцион \"" + name + "\" добавлен в парк.");
        } else {
            System.out.println("Достигнуто максимальное количество аттракционов!");
        }
    }

    public void printAllAttractions() {
        System.out.println("\n=== АТТРАКЦИОНЫ ПАРКА \"" + name + "\" ===");
        System.out.println("Адрес: " + address);
        System.out.println("Часы работы парка: " + workingHours);
        System.out.println("\nСписок аттракционов:");

        if (attractionCount == 0) {
            System.out.println("В парке пока нет аттракционов.");
        } else {
            for (int i = 0; i < attractionCount; i++) {
                System.out.println("\n" + (i + 1) + ". ");
                attractions[i].printInfo();
            }
        }
        System.out.println("================================\n");
    }

    // Внутренний класс Attraction
    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: \"" + name + "\"");
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
        }
    }
}