package day011225.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = negateData(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> negateData(List<Integer> data) {
        return data.stream().map(x -> x * -1).collect(Collectors.toList());
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<Integer>>() {}.getType());
    }
}

/**
 * У вас есть переменная data которая содержит входные пользовательские данные.
 *
 * data - массив из элементов целых чисел.
 *
 * Напишите код, который заменяет числовые значения элементов массива data на противоположные и записывает новый массив в переменную result.
 * */