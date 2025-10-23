package day231025.task2;

public class ProductionCounter {

    // Публичный метод, в котором создаём анонимный класс Runnable и вызываем его run()
    public void startCountOperation() {
        // Создаём объект интерфейса Runnable с помощью анонимного класса

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Счетчик запущен");
            }
        };

        runnable.run();
        // Вызываем метод run() прямо внутри startCountOperation()

    }

    public static void main(String[] args) {
        // Создаём объект ProductionCounter и запускаем операцию подсчёта
        ProductionCounter counter = new ProductionCounter();
        counter.startCountOperation();
    }
}