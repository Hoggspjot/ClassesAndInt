package december.day221225;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Number> data = readInput();
        int result = sumOfMissingNumbers(data);
        System.out.println(result);
    }

    public static int sumOfMissingNumbers(List<Number> data) {
        int min = data.get(0).intValue();
        int max = data.get(data.size()- 1).intValue();

        Set<Integer> numbers = data.stream().map(Number::intValue).collect(Collectors.toSet());

        List<Integer> full = IntStream.rangeClosed(min, max).boxed().collect(Collectors.toList());

        Integer sum = full.stream().filter(x -> !numbers.contains(x)).collect(Collectors.summingInt(x -> x));

        return sum;
    }

    public static List<Number> readInput() {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new Gson();
        String input = scanner.nextLine();
        return gson.fromJson(input, new ArrayList<Number>().getClass());
    }
}


/**
 * У вас есть переменная data которая содержит входные пользовательские данные.
 *
 * Напишите код, который возвращает сумму пропущенных чисел из списка data и записывает результат в переменную result.
 *
 * Например:
 *
 * [
 * 1
 * ,
 * 3
 * ,
 * 5
 * ]
 * =
 *
 * 2
 * +
 * 4
 * =
 * 6
 * [1,3,5]= 2+4=6
 *
 * [
 * 1
 * ,
 * 5
 * ]
 * =
 * 2
 * +
 * 3
 * +
 * 4
 * =
 * 9
 * [1,5]=2+3+4=9
 *
 * [
 * 1
 * ,
 * 2
 * ,
 * 3
 * ]
 * =
 * 0
 * [1,2,3]=0*/