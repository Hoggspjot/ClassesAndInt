package november.day261125.task1;

import com.google.gson.Gson;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, List<List<Integer>>> input = readInput();
        int k = input.getFirst();
        List<List<Integer>> data = input.getSecond();
        boolean result = findNumber(k, data);
        System.out.println(result);
    }

    public static boolean findNumber(int k, List<List<Integer>> data) {
        return data.stream()
                .flatMap(List::stream)
                .anyMatch(x -> x == k);
    }

    public static Pair<Integer, List<List<Integer>>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] values = input.split(" \\| ");
        int k = Integer.parseInt(values[0]);
        List<List<Integer>> data = new Gson().fromJson(values[1], new com.google.gson.reflect.TypeToken<List<List<Integer>>>() {}.getType());

        return new Pair<>(k, data);
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


/**У вас есть переменные k, data которые содержат входные пользовательские данные.

 data - двумерный список из элементов целых чисел.

 Напишите код, который находит число k в двумерном в списке data и записывает логический результат в переменную result.

 Пример двумерного списка:

 [
 [1,2,3],
 [4,5,6],
 [7,8,9]
 ]


 Важно!

 Список data может быть любого размера.*/