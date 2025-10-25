package day251025.task3;

public class Main {
    public static void main(String[] args) {
        // Создаем объект кошки и печатаем оба имени
        Cat cat = new Cat();
        cat.printNames();
    }
}


class Animal {
    String name = "Животное";

}

class Cat extends Animal {
    String name = "Кошка";

    void printNames() {
        System.out.println(name);
        System.out.println(super.name);
    }

}