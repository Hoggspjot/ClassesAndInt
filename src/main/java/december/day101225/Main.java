package december.day101225;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        String result = countZerosBeforeAndAfter(data);
        System.out.println(result);
    }

    public static String countZerosBeforeAndAfter(List<Integer> data) {
        int first = data.indexOf(1);
        int second = data.lastIndexOf(1);

        int before = first;
        int after = data.size() - second - 1;
        return "Количество нулей перед единицей: " + before + ", " + "Количество нулей после единицы: " + after;
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
 * data - список из элементов целых числел. Элементы 0 и одна 1.
 *
 * Напишите код, который определяет количество 0 до и после 1 и записывает результат в переменную result.*/