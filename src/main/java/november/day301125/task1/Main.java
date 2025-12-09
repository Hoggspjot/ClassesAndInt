package november.day301125.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        Integer result = findFirstNegative(data);
        System.out.println(result != null ? result : 0);
    }

    public static Integer findFirstNegative(List<Integer> data) {
        return data.stream().filter(x -> x < 0).findFirst().orElse(0);
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
 * Напишите код, который выбирает первый отрицательный элемент из списка data и записывает результат в переменную result.
 *
 * Если отрицательный элемент не найден, тогда возвращаем 0*/