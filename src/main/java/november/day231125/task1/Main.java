package november.someTAsk.task1;

import com.google.gson.Gson;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, List<Integer>> input = readInput();
        int n = input.getFirst();
        List<Integer> data = input.getSecond();
        String result = copyItems(n, data);
        System.out.println(result);
    }

    public static String copyItems(int n, List<Integer> items) {
        for (int i = 0; i < n; i++) {
            items.add(items.get(i));
        }
        return items.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }

    public static Pair<Integer, List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] values = input.split(" \\| ");
        int n = Integer.parseInt(values[0]);
        List<Integer> data = new Gson().fromJson(values[1], new com.google.gson.reflect.TypeToken<List<Integer>>() {}.getType());

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


/*У вас есть переменные n и items, которые содержат входные пользовательские данные.

items - список из элементов типа данных Int.

Напишите код, который копирует элементы списка items из начала списка в конец списка и записывается результат в переменную result.

n - число элементов которые необходимо скопировать.*/