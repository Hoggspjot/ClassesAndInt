package year2026.july.day03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Введи число");
        try (Scanner scanner = new Scanner((System.in))) {

            while (!scanner.hasNextInt()) {
                System.out.println("Эй! Это не число!");
                scanner.next();
            }
            num = scanner.nextInt();
        }


        if (num < 0) {
            System.out.println(false);
        }
        if (num > 0) {
            System.out.println(true);
        }
        if (num == 0) {
            System.out.println("Great!");
        }


    }
}
