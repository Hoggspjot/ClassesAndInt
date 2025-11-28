package day281125.task2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Triple<List<Integer>, Integer, Integer> input = readInput();
        List<Integer> data = input.getFirst();
        int start = input.getSecond();
        int end = input.getThird();
        int result = 0;


        List<Integer> newList = data.subList(start -1 , end+1);
        for (Integer x : newList) {
            result += x;
        }
        System.out.println(newList);

        System.out.println(result);
    }

    public static Triple<List<Integer>, Integer, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split(" \\| ");

        List<Integer> data = new Gson().fromJson(values[0], new TypeToken<List<Integer>>() {}.getType());
        int start = Integer.parseInt(values[1]);
        int end = Integer.parseInt(values[2]);

        return new Triple<>(data, start, end);
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


/**
 * У вас есть переменные data, start, end, которые содержат входные пользовательские данные.
 *
 * data - список из элементов целых чисел.
 *
 * Напишите код, который суммирует числа в списке data между числами start и end включительно и записывает результат в переменную result.
 *
 * Пример1.
 * Eсли start = 2, end = 4, data = [1, 2, 3, 4, 5] тогда
 * 2
 * +
 * 3
 * +
 * 4
 * =
 * 9
 * 2+3+4=9
 *
 * Пример2.
 * Eсли start = 1, end = 3, data = [1, 2, 3, 3, 5] тогда
 * 1
 * +
 * 2
 * +
 * 3
 * +
 * 3
 * =
 * 9
 * 1+2+3+3=9
 *
 * Пример3.
 * Eсли start = 42, end = 1, data = [1, 2, 3, 3, 5] тогда
 * 0
 * +
 * 0
 * =
 * 0
 * 0+0=0*/