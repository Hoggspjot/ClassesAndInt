package october.day271025.task2;

public class Main {
    public static void main(String[] args) {
        // Полиморфизм: ссылка типа Animal указывает на объект фактического типа Cat
        Animal mysteriousCreature = new Cat();

        // Вызов sleep() приведёт к вызову Cat.makeSound() благодаря динамическому связыванию
        mysteriousCreature.sleep();
    }
}

class Animal {

    void makeSound() {
        System.out.println("Some sound");
    }

    void sleep() {
        System.out.println("Animal is going to sleep...");
        this.makeSound();
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}