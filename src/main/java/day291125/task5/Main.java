package day291125.task5;

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