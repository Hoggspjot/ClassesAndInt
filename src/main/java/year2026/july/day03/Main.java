package year2026.july.day03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Введи число");
        try (Scanner scanner = new Scanner((System.in))) {

            num = scanner.nextInt();
        }


        if (num < 0) {
            System.out.println(false);
        }
        if (num >= 1 && num < 2) {
            System.out.println(true);
        }
        if (num == 0) {
            System.out.println("Great!");
        }
    }
}
