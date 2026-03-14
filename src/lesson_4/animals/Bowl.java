package lesson_4.animals;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0); // не может быть отрицательной
    }

    public boolean decreaseFood(int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя уменьшить еду на отрицательное количество!");
            return false;
        }
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды. Теперь в миске: " + foodAmount);
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды!");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void info() {
        System.out.println("В миске сейчас " + foodAmount + " еды.");
    }
}