package december.day121225;

import com.google.gson.Gson;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int length = readInput();
        List<Integer> result = generateArray(length);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> generateArray(int length) {
        List<Integer> list = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                list.add(1);
            } else {
                list.add(i % 3);
            }
        }
        return list;
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}


/**
 * У вас есть переменная length которая содержит входные пользовательские данные.
 *
 * length - это длина списка.
 *
 * Напишите код, который формирует список из целых чисел, в котором на четных местах стоят единицы, а на нечетных местах стоят числа, равные остатку от деления своего номера индекса на 3 и записывает результат в переменную result.*/