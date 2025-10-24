package day241025.task2;

// Универсальная пара данных: класс для хранения двух связанных элементов одного типа
class DataPair<T> {
    // Два приватных поля обобщённого типа T
    private T firstElement;
    private T secondElement;

    // Конструктор принимает два значения и инициализирует поля

    public DataPair(T firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirst() {
        return firstElement;
    }

    public T getSecond() {
        return secondElement;
    }
    // Возвращаем первый элемент пары


    // Возвращаем второй элемент пары

}

public class Main {
    public static void main(String[] args) {
        // Создаем объект DataPair для строк и передаем "Hello" и "World"
        DataPair<String> pair = new DataPair<>("Hello", "World");

        // Выводим оба значения через пробел
        System.out.println(pair.getFirst() + " " + pair.getSecond());
    }
}