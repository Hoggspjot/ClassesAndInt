package november.someTAsk.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, List<Integer>> input = readInput();
        int n = input.getFirst();
        List<Integer> data = input.getSecond();
        String result = multiplyAndSortList(data, n);
        System.out.println(result);
    }

    public static String multiplyAndSortList(List<Integer> data, int n) {

        return data.stream()
                .map(x -> x * n)
                .sorted().map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static Pair<Integer, List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>(){}.getType();
        List<Integer> data = gson.fromJson(input.split(" \\| ")[1], listType);
        int n = Integer.parseInt(input.split(" \\| ")[0]);

        return new Pair<>(n, data);
    }
}

class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}


/*У вас есть переменные n, data которые содержат входные пользовательские данные.

data - список из элементов целых чисел.

Напишите код, который умножает каждый элемент списка на значение переменной
 n и записывает отсортированный результат в порядке возрастания в виде строки через запятую в переменную result.*/