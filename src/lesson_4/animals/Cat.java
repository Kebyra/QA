package lesson_4.animals;

public class Cat extends Animal {
    private boolean isFull; // сытость
    public static final int RUN_LIMIT = 200;

    public Cat(String name) {
        super(name, RUN_LIMIT, 0); // коты не умеют плавать
        this.isFull = false;
        catCount++;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            isFull = true;
            System.out.println(name + " покушал " + amount + " еды и теперь сыт!");
        } else {
            System.out.println(name + " не стал есть: в миске недостаточно еды (" + amount + " нужно, " + bowl.getFoodAmount() + " есть)");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать! Коты боятся воды.");
    }
}