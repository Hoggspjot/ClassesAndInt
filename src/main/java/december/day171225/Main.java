package december.day171225;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        int result = findLongestSeries(data);
        System.out.println(result);
    }

    public static int findLongestSeries(List<Integer> data) {
        int count = 0;
        int result = 0;
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i) > data.get(i - 1)) {
                if (count == 0) {
                    count += 2;
                } else {
                    count++;
                }
            } else {
                count = 0;
            }
            if (result < count) {
                result = count;
            }
        }
        return result;
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>(){}.getType();
        return gson.fromJson(input, listType);
    }
}


/**
 * У вас есть переменная data которая содержит входные пользовательские данные.
 *
 * data - список из элементов целых числел.
 *
 * Напишите код, который находит наибольшую серию подряд идущих элементов, расположенных по возрастанию.
 *
 * Результат записать в переменную result. */