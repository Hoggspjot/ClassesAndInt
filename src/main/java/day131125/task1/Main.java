package day131125.task1;

import com.google.gson.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> tags = readInput();
        String result ="";

        Map<String, Integer> map = new LinkedHashMap<>();



        for (int i = 0; i < tags.size(); i++) {
            if (map.get(tags.get(i)) == null) {
                map.put(tags.get(i), 1);
            } else {
                map.put(tags.get(i), map.get(tags.get(i)) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result += entry.getKey() + ": " + entry.getValue() + ", ";
        }
        result = result.substring(0, result.length() - 2);
        System.out.println(result);
    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
            Gson gson = new Gson();
            String[] dataArray = gson.fromJson(input, String[].class);
            return Arrays.asList(dataArray);
        }
        scanner.close();
        return null;
    }
}

/*У вас есть переменная tags, которая содержит входные пользовательские данные.

tags - список из элементов строк.

Напишите код, который считает количество тегов в списке tags и
записывает отсортированный результат в том порядке в котором теги были найдены через запятую в переменную result.*/