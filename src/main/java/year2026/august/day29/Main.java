package year2026.august.day29;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];

        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n--------------------------------------");
        double num = middle(array);
        System.out.println("Среднее арифметическое равно - "+ num);

    }

    public static double middle(int[] array) {
        int sum = 0;
        int numOfEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                numOfEvens++;
                System.out.print(array[i] + " четное ");
            }
        }
        System.out.println("\n--------------------------------------");
        System.out.println("\nКоличество четных числе в массиве - " + numOfEvens + " ");
        return (double) sum / numOfEvens ;
    }
}
