package day241025.task4;

public class Main {
    public static void main(String[] args) {
        // Создаём специализированную корзину для яблок
        AppleBasket appleBasket = new AppleBasket();

        // Ковариантность: метод AppleBasket.getFruit() возвращает Apple,
        // но мы можем сохранить результат в переменную типа Fruit
        Fruit harvestedItem = appleBasket.getFruit();

        // Проверяем, действительно ли из корзины пришло яблоко
        if (harvestedItem instanceof Apple) {
            System.out.println("Apple created");
        }
    }
}

class Fruit {


}

class Apple extends Fruit {

}

class Basket {

    Fruit getFruit() {
        return new Fruit();
    }
}

class AppleBasket extends Basket {

    @Override
    Apple getFruit() {
        return new Apple();
    }
}