package lesson_4.animals;

public abstract class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    // Статические счетчики
    protected static int animalCount = 0;
    protected static int dogCount = 0;
    protected static int catCount = 0;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (максимум " + runLimit + " м.)");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать!");
        } else if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м. (максимум " + swimLimit + " м.)");
        }
    }

    // Геттеры для счетчиков
    public static int getAnimalCount() {
        return animalCount;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public static int getCatCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }
}