package day081225.task2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        String result = balance(data);
        System.out.println(result);
    }

    public static String balance(List<Integer> data) {
        List<Integer> left = data.subList(0, data.size() / 2);
        List<Integer> right = data.subList(data.size() / 2, data.size());

        int leftWeight = left.stream().mapToInt(Integer::intValue).sum();
        int rightWeight = right.stream().mapToInt(Integer::intValue).sum();
        if (leftWeight > rightWeight) {
            return "Левая сторона тяжелее";
        } else if (leftWeight < rightWeight) {
            return "Правая сторона тяжелее";
        } else {
            return "Обе стороны сбалансированы";
        }
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<Integer>>() {}.getType());
    }
}


/**У вас есть переменная data которая содержит входные пользовательские данные.

 data - массив из элементов целых чисел. Количество элементов всегда четное.

 Напишите код, который определяет вес левой и правой стороны массив и записывает результат в переменную  result.

 Условия:

 Если левая сторона имеет больший вес, тогда записываем сообщение: Левая сторона тяжелее
 Если правая сторона имеет больший вес, тогда записываем сообщение: Правая сторона тяжелее
 Если вес обеих сторон имеют одинаковый, тогда записываем сообщение: Обе стороны сбалансированы
 */