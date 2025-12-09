package december.day021225.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = getGreaterThanPrevious(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> getGreaterThanPrevious(List<Integer> data) {

        return IntStream.range(1, data.size())
                .filter(i -> data.get(i) > data.get(i - 1))
                .mapToObj(data::get)
                .collect(Collectors.toList());
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