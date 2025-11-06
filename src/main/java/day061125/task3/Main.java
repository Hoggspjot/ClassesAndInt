package day061125.task3;


public class Main {
    public static void main(String[] args) {
        // Создаем конкретную реализацию интерфейса Printer
        ConsolePrinter printer = new ConsolePrinter();

        // Вызываем default-метод интерфейса, который печатает сообщение дважды
        printer.printTwice("Java");
    }
}


interface Printer {
    void print(String string);

    default void printTwice(String s) {
        print(s);
        print(s);
    }
}

class ConsolePrinter implements Printer {

    @Override
    public void print(String string) {
        System.out.println(string);
    }
}