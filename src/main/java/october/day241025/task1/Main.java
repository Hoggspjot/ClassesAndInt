package october.day241025.task1;

class SmartBox<T> {
    private T item;

    void store(T item) {
        this.item = item;
    }

    T getContents() {
        return item;
    }
}


public class Main {
    public static void main(String[] args) {
        // Создаём коробку, которая может хранить только целые числа (Integer)
        SmartBox<Integer> intBox = new SmartBox<>();

        // Помещаем число 42 (автобоксинг int -> Integer)
        intBox.store(42);

        // Извлекаем содержимое и выводим на экран
        Integer value = intBox.getContents();
        System.out.println(value);
    }
}