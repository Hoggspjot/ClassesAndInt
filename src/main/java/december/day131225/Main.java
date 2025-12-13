package december.day131225;

import com.google.gson.Gson;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int length = readInput();
        List<Integer> result = generateArray(length);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> generateArray(int length) {
       int length2 = length * 2;
        return Stream.concat(
          IntStream.range(0,length2 / 2)
                  .map(x -> x + 1)
                  .boxed(),
          IntStream.range(length2 /2 , length2)
                  .map(x -> length2 - x)
                  .boxed()
        ).collect(Collectors.toList());
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
 * Напишите код, который формирует список из целых чисел, который одинаково читается как слева направо, так и справа налево и записывает результат в переменную result.*/