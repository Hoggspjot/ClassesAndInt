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
        int first = 0;
        int num = 0;
        int second = 0;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) != 0) {
                second = data.size() - (i + 1);
                break;
            } else {
                first++;
            }
        }
        return "Количество нулей перед единицей: " + first + ", " + "Количество нулей после единицы: " + second;
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