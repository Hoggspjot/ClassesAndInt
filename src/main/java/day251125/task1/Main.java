package day251125.task1;

import com.google.gson.Gson;
import java.util.*;
import java.util.stream.Collectors;

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
        if (!(position.equals("left") || position.equals("right"))) {
            return "Неверная позиция";
        } else if (data.size() > size) {
            return "Неверный размер";
        }
        List<Integer> newList = new ArrayList<>();
        if (size == data.size()) {
            return data.stream().map(String::valueOf).collect(Collectors.joining(", "));
        }
        if (position.equals("left")) {
            for (int i = 0; i < size; i++) {
                if (i < size - data.size()) {
                    newList.add(0);
                } else {
                    newList.addAll(data);
                    break;
                }
            }
        }
        if (position.equals("right")) {
            for (int i = 0; i < size; i++) {
                if (data.size() > i) {
                    newList.add(data.get(i));
                } else {
                    newList.add(0);
                }
            }
        }
        return newList.stream().map(String::valueOf).collect(Collectors.joining(", "));
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