package november.day291125.task3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = replaceNegativeWithZero(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> replaceNegativeWithZero(List<Integer> data) {
        return data.stream().map(x -> x < 0 ? 0 : x).toList();
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<Integer>>() {}.getType());
    }
}

/**У вас есть переменная data которая содержит входные пользовательские данные.

 data - список из элементов целых чисел.

 Напишите код, который принимает список чисел data и возвращает новый список,
 в котором все отрицательные числа заменены на 0 и записывает новый список в переменную result.*/