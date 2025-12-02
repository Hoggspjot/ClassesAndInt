package day021225.task4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BusinessTrip trip = new BusinessTrip();
        trip.fullName = scanner.nextLine();
        trip.days = scanner.nextInt();
        trip.costs = scanner.nextInt();

        trip.show();
    }
}

class BusinessTrip {
    public static final int DAILY = 25;
    String fullName;
    int costs;
    int days;

    public int getTotal() {
        return costs + (days * DAILY);
    }

    public void show() {
        System.out.print("Суточные = " + DAILY + "\n" +
                "Фамилия Имя = " + fullName + "\n" +
                "Транспортные расходы = " + costs + "\n" +
                "Количество дней = " + days + "\n" +
                "Итого расходы = " + getTotal() + "\n");

    }
}