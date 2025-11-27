package day271125.task2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> data = readInput();
        StringBuilder result = new StringBuilder();

        Map<String, Integer> map = new HashMap<>();
        for (String s : data) {
            if (map.get(s) != null) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println(result);
    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<String>>() {}.getType());
    }
}

/**У вас есть переменная data которая содержит входные пользовательские данные.

 data - список из элементов строки.

 Напишите код, который проходит по массиву data, и записывает символы вместе с числом их повторений в переменную result.*/