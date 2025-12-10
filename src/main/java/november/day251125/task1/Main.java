package november.day251125.task1;

import com.google.gson.Gson;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Triple<Integer, String, List<Integer>> input = readInput();
        int size = input.getFirst();
        String position = input.getSecond();
        List<Integer> data = input.getThird();
        String result = fillArray(size, position, data);
        System.out.println(result);
    }

    public static String fillArray(int size, String position, List<Integer> data) {
        if (!"left".equals(position) && !"right".equals(position)) {
            return "Неверная позиция";
        }

        if (data.size() > size) {
            return "Неверный размер";
        }
        if (size == data.size()) {
            return format(data);
        }

        int zero = size - data.size();
        List<Integer> numZero = Collections.nCopies(zero, 0);

        List<Integer> result;
        if ("left".equals(position)) {
            result = Stream.concat(numZero.stream(), data.stream())
                    .collect(Collectors.toList());
        } else {
            result = Stream.concat(data.stream(), numZero.stream())
                    .collect(Collectors.toList());
        }
        return format(result);
    }

    public static String format(List<Integer> list) {
        return list.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }

    public static Triple<Integer, String, List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] values = input.split(" \\| ");
        int size = Integer.parseInt(values[0]);
        String position = values[1];
        List<Integer> data = new Gson().fromJson(values[2], new com.google.gson.reflect.TypeToken<List<Integer>>() {}.getType());

        return new Triple<>(size, position, data);
    }
}

class Triple<F, S, T> {
    private final F first;
    private final S second;
    private final T third;

    public Triple(F first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }
}


/*У вас есть переменныe size, position, data, которые содержат входные пользовательские данные.

data - список из элементов целых чисел.

Напишите код, который заполняет список data до нужного размера size нулями 0 в зависимости от значения position, которое может принимать значения: left или right.

Важно!

Если размер списка data  больше размера size, тогда в переменную result записываем сообщение:
Неверный размер
Если размер списка data  равен значению переменной size, тогда в переменную result записываем:
Массив data в виде строки через запятую.
Если значение переменной position не равно left или right, тогда в переменную result записываем сообщение:
Неверная позиция
Сначала проверяем на корректность позиции, затем на корректность размера.
Результат записать в виде строки через запятую в переменную result.*/