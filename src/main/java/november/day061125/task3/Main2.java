package november.day061125.task3;

// Демонстрация разрешения конфликта default-методов при множественной реализации интерфейсов.
public class Main2 {
    public static void main(String[] args) {
        C c = new C();
        c.show(); // Должно вывести: A (с новой строки) затем B
    }
}

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {
    @Override
    public void show() {
        A.super.show();
        B.super.show();
    }
}