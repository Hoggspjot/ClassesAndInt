package november.day141125.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        String result;

        result = findEvenOddNumbers(data);

        System.out.println(result);
    }

    public static String findEvenOddNumbers(List<Integer> data) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) % 2 == 0) {
                even.add(data.get(i));
            } else {
                odd.add(data.get(i));
            }
        }

        return  "("+even.stream().sorted().map(String::valueOf).collect(Collectors.joining(", "))+") "
                +"("+ odd.stream().sorted().map(String::valueOf).collect(Collectors.joining(", "))+")";

    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>(){}.getType();
        return gson.fromJson(input, listType);
    }
}


/*У вас есть переменная data, которая содержит входные пользовательские данные.

data - список из элементов целых чисел.

Напишите код, который будет находить четные и нечетные числа и записывать результат в виде строки:
(четные) (нечетные) в переменную result.

Важно! Четные и нечетные числа должны быть отсортированы в порядке возрастания.*/