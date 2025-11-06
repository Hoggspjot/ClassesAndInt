package day061125.task2;

public class Main {
    public static void main(String[] args) {
        // Создаем устройство и демонстрируем работу методов
        MyCounter device = new MyCounter();
        device.increment(); // должен вывести "Counter incremented"
        device.reset();     // должен вывести "Counter reset"
    }
}

interface Counter {
    void increment();

    default void reset() {
        System.out.println("Counter reset");
    }
}

class MyCounter implements Counter {

    @Override
    public void increment() {
        System.out.println("Counter incremented");
    }
}