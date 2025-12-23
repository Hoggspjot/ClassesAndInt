package december.day231225;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        int result = sumOfMissingEvenNumbers(data);
        System.out.println(result);
    }

    public static int sumOfMissingEvenNumbers(List<Integer> data) {
        int min = data.get(0);
        int max = data.get(data.size() - 1);

        List<Integer> full = IntStream.rangeClosed(min, max).boxed().collect(Collectors.toList());

        return full.stream().filter(x -> !data.contains(x)).filter(x -> x % 2 == 0).collect(Collectors.summingInt(x -> x));

    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Type listType = new TypeToken<ArrayList<Integer>>() {}.getType();
        return new Gson().fromJson(input, listType);
    }
}


/**У вас есть переменная data которая содержит входные пользовательские данные.

 Напишите код, который возвращает сумму пропущенных четных чисел из списка data и записывает результат в переменную result.*/