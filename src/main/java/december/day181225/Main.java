package december.day181225;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        int result = findSeriesCount(data);
        System.out.println(result);
    }

    public static int findSeriesCount(List<Integer> data) {
        int count = 0;
            for (int i = 1; i < data.size(); i++) {
            if (data.get(i) == data.get(i - 1)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Integer>>() {}.getType();
        return gson.fromJson(input, listType);
    }
}

/**
 * У вас есть переменная data которая содержит входные пользовательские данные.
 *
 * data - список из элементов целых числел.
 *
 * Напишите код, который находит количество серий из подряд идущих одинаковых чисел.
 *
 * Результат записать в переменную result.
 *
 * Например, в таком списке [1, 2, 2, 3, 3, 3, 4, 4, 4, 4] - 6 серий:*/