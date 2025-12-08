package day081225.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> data = readInput();
        List<Integer> result = columnSum(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> columnSum(List<List<Integer>> data) {
        List<Integer> newList = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < data.get(0).size(); i++) {
            for (int j = 0; j < data.size(); j++) {
                num += data.get(j).get(i);
            }
            newList.add(num);
            num = 0;
        }
        return newList;
    }

    public static List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<List<Integer>>>() {}.getType());
    }
}


/**
 * У вас есть переменная data которая содержит входные пользовательские данные.
 *
 * data - двумерный массив из элементов целых чисел.
 *
 * Напишите код, который находит сумму элементов для каждого столбца двумерного массива data и записывает результат в новый массив.
 *
 * Новый массив необходимо записать в переменную result.*/