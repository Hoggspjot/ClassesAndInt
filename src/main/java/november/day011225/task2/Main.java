package november.day011225.task2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = multiplyMax(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> multiplyMax(List<Integer> data) {
        int max = data.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
        return data.stream().map(x -> x * max).collect(Collectors.toList());
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<Integer>>() {}.getType());
    }
}


/**У вас есть переменная data которая содержит входные пользовательские данные.

 data - массив из элементов целых чисел.

 Напишите код, который умножает все числовые значения элементов массива data на максимальный элемент массива data и записывает новый массив в переменную result.
 * */