package day081225.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> data = readInput();
        List<Integer> result = columnSum(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> columnSum(List<List<Integer>> data) {

        int st = data.get(0).size();

        return IntStream.range(0, st)
                .mapToObj(n -> data.stream().mapToInt(x -> x.get(n)).sum())
                .collect(Collectors.toList());
    }

    public static List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<List<Integer>>>() {}.getType());
    }
}


/**
 * У вас есть переменная data которая содержит входные пользовательские данные.
 *
 * data - двумерный массив из элементов целых чисел.
 *
 * Напишите код, который находит сумму элементов для каждого столбца двумерного массива data и записывает результат в новый массив.
 *
 * Новый массив необходимо записать в переменную result.*/