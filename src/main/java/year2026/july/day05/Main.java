package year2026.july.day05;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(101);
        }

        for (Integer x : array) {
            System.out.print(x+ " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            sum += array[i];
        }
        System.out.println("Сумма элементов = "+ sum);

    }
}
