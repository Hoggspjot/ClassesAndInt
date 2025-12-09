package november.day061125.task2;

public class Main2 {
    public static void main(String[] args) {
        // Создаем объект Dog и вызываем его методы
        Dog dog = new Dog();
        dog.voice();
        dog.sleep();
    }
}

interface Animal {
    void voice();

    default void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}