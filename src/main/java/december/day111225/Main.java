package december.day111225;

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

        return IntStream.iterate(3 * length, n -> n - 3)
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
 * Напишите код, который формирует убывающий список из целых чисел, делящихся на 3 и записывает результат в переменную result.*/