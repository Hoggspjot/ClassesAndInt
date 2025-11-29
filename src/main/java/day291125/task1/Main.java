package day291125.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = mirrorArray(data);
        System.out.println(convertToString(result));
    }

    public static List<Integer> mirrorArray(List<Integer> data) {
        List<Integer> newList = new ArrayList<>(data);
        for (int i = data.size() - 2; i >= 0; i--) {
            newList.add(data.get(i));
        }
        return newList;
    }

    public static String convertToString(List<Integer> arr) {
        return arr.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> data = new Gson().fromJson(input, new TypeToken<List<Integer>>() {}.getType());
        return data;
    }
}


/**У вас есть переменная data которая содержит входные пользовательские данные.

 data - список из элементов целых чисел.

 Напишите код, который отображает зеркально список data в новом списке и записывает результат через запятую в переменную result.*/