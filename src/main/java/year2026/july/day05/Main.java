package year2026.july.day05;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int leng = 0;
        int sum = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введи желаемую длину массива");
            while (leng <= 0) {
                if (scanner.hasNextInt()) {
                    leng = scanner.nextInt();
                    if (leng <= 0) {
                        System.out.println("Введи число больше 0!");
                    }
                }else {
                    System.out.println("Введи число!");
                    scanner.next();
                }
            }
        }

        int[] array = new int[leng];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
            sum += array[i];
        }

        for (Integer x : array) {
            System.out.print(x+ " ");
        }
        System.out.println();

        System.out.println("Сумма элементов = "+ sum);

    }
}
