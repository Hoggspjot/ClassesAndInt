package november.day291125.task5;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = replaceZeroWithSum(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> replaceZeroWithSum(List<Integer> data) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == 0) {
                if (i - 2 >= 0) {
                    newList.add(i, newList.get(i - 1) + newList.get(i - 2));
                } else {
                    newList.add(0);
                }
            } else {
                newList.add(data.get(i));
            }


        }
        return newList;
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
 * Напишите код, который вместо каждого элемента с нулевым значением поставляет сумму двух предыдущих элементов списка и записывает результат в виде нового списка в переменную result.*/