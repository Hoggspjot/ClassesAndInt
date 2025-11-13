package day131125.task1;

import com.google.gson.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> tags = readInput();
        String result ="";

        result = tags.stream()
                        .collect(Collectors.groupingBy(
                                tag -> tag,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ))
                                .entrySet()
                                .stream()
                                .map(entry -> entry.getKey()+": "+ entry.getValue())
                                .collect(Collectors.joining(", "));




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