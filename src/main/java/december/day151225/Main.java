package december.day151225;

import com.google.gson.Gson;

import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        int result = findMostFrequentElement(data);
        System.out.println(result);
    }

    public static int findMostFrequentElement(List<Integer> data) {
        Map<Integer, Long> map = data.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        return map.entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(-1);
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Gson gson = new Gson();
        Integer[] dataArray = gson.fromJson(input, Integer[].class);
        return Arrays.asList(dataArray);
    }
}


/**
 * У вас есть переменная data которая содержит входные пользовательские данные.
 *
 * data - список из элементов целых числел.
 *
 * Напишите код, который находит наиболее часто встречающийся элемент в списке целых чисел.
 *
 * Результат записать в переменную result. */