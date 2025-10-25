package day251025.task2;

public class Main {
    public static void main(String[] args) {
        // Создаем объект собаки и вызываем её метод makeSound()
        Dog dog = new Dog();
        dog.makeSound();
    }
}

class Animal {

    void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Собака лает");
    }
}