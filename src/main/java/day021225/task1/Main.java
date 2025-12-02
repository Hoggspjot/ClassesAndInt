package day021225.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = getGreaterThanPrevious(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> getGreaterThanPrevious(List<Integer> data) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 1; i < data.size(); i++) {
                if (data.get(i) > data.get(i - 1)) {
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
 * data - массив из элементов целых чисел.
 *
 * Напишите код, который выбирает элементы массива data, которые больше, чем элементы, стоящие перед ними и записывает новый массив в переменную result.*/