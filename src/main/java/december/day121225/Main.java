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
        return IntStream.range(0, length)
                .map(x -> (x % 2 == 0) ? 1 : x % 3)
                .limit(length)
                .boxed()
                .collect(Collectors.toList());
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