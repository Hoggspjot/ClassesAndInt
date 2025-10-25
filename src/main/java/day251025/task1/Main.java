package day251025.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readInput();
        String result = "";
        if (n > 0) {
            result = "Число позитивное";
        } else if (n == 0) {
            result = "Число равно 0";
        } else {
            result = "Число негативное";
        }

        System.out.println(result);
    }

    public static int readInput() {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            n = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return n;
    }
}