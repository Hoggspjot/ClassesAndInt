package day011225.task3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = filterAboveAverage(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> filterAboveAverage(List<Integer> data) {
        int sum = data.stream().mapToInt(Integer::intValue).sum();
        double avg = sum / data.size();
        return data.stream().filter(x -> x > avg).collect(Collectors.toList());
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
 * Напишите код, который выбирает элементы массива data, которые больше среднего арифметического массива data и записывает новый массив в переменную result.*/