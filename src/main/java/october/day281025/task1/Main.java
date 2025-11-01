package october.day281025.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readInput();
        int result;


        result = subfactorial(n);

        System.out.println(result);
    }

    public static int subfactorial(int n) {
        if (n == 0) return 1;
        if (n == 1) return 0;

        return n * subfactorial(n - 1) + (int) Math.pow(-1, n);
    }


    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}