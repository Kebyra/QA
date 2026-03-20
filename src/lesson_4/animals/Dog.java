package lesson_4.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 500, 10); // собака: бег 500 м., плавание 10 м.
        dogCount++;
    }
}