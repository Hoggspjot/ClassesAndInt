package year2026.july.day04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введи первое число");
            while (!scanner.hasNextInt()) {
                System.out.println("Эй, это не число");
                scanner.next();
            }
            a = scanner.nextInt();
            System.out.println("Введи второе число");
            while (!scanner.hasNextInt()) {
                System.out.println("Эй, это не число");
                scanner.next();
            }
            b = scanner.nextInt();
        }

        if (a > 0) {
            System.out.println("first a is Great!");
        }
        if (b < 0) {
            System.out.println("first b Great!");
        }
        c = a - b;
        if (c > 0) {
            System.out.println(" a is great!");
        }
        c = b - a;
        if (c > 0) {
            System.out.println("b is great!");
        }
        if (c == 0) {
            System.out.println("Super great!");
        }
    }
}
