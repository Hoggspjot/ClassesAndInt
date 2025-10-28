package day281025.task2;

public class Main {
    public static void main(String[] args) {
        // Полиморфизм: хотя массив Vehicle[], фактически в нём разные потомки
        Vehicle[] parade = {
                new Car(),
                new Bicycle(),
                new Scooter() // новый тип транспорта добавлен без изменения логики обхода
        };

        // Единый код обхода — для каждого элемента вызываем move()
        // Благодаря переопределению у каждого типа будет свой вывод
        for (Vehicle v : parade) {
            v.move();
        }
    }
}

class Vehicle {

    void move() {
        System.out.println("Транспорт движется.");
    }
}

class Car extends Vehicle {

    @Override
    void move() {
        System.out.println("Машина едет.");
    }
}

class Bicycle extends Vehicle {

    @Override
    void move() {
        System.out.println("Велосипед едет.");
    }
}

class Scooter extends Vehicle {

    @Override
    void move() {
        System.out.println("Самокат едет.");
    }
}