package day231025.task1;

// Объявляем интерфейс Communicator с единственным методом greet
interface Communicator {
    void greet();
}

public class Main {
    public static void main(String[] args) {
        // Создаем объект анонимного класса, реализующего Communicator

        Communicator communicator = new Communicator() {
            @Override
            public void greet() {
                System.out.println("Привет, мир!");
            }
        };

        communicator.greet();
        // Вызываем метод greet(), чтобы вывести приветствие на экран

    }
}