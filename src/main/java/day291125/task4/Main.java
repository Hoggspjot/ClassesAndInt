package day291125.task4;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        boolean result = hasTwoConsecutiveZeros(data);
        System.out.println(result);
    }

    public static boolean hasTwoConsecutiveZeros(List<Integer> data) {
        boolean flag = false;
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) == 0 && data.get(i - 1) == 0) {
                flag = true;
            }
        }
        return flag;
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
 * data - список из элементов целых чисел.
 *
 * Напишите код, который определяет, имеются ли в списке два подряд идущих нуля и записывает логический результат в переменную result.*/