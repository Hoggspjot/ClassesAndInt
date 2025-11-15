package day151125.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> data = readInput();
        int result;

        result = findMinNumber(data);

        System.out.println(result);
    }

    public static int findMinNumber(List<List<Integer>> data) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < data.size(); i++) {
            int tmp = Collections.min(data.get(i));
            if (tmp < min) {
                min = tmp;
            }
        }
        return min;
    }

    public static List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<List<Integer>>>(){}.getType();
        return gson.fromJson(input, listType);
    }
}


/*У вас есть переменная data, которая содержит входные пользовательские данные.

data - двумерный список из элементов целых чисел.

Напишите код, который находит минимальное число в двумерном списке произвольного размера и записывает результат в переменную result.*/


/*    */