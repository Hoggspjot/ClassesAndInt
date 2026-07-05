package year2026.july.day06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ВВеди первое число");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число!");
                scanner.next();
            }
            a = scanner.nextInt();
            System.out.println("Введи второе число");

            while (!scanner.hasNextInt()) {
                System.out.println("Это не число!");
                scanner.next();
            }
            b = scanner.nextInt();
        }

        if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Деление на ноль невозможно!");
        }

    }
}
