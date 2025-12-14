package december.day141225;

import com.google.gson.Gson;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> data = readInput();
        String result = countNumbers(data);
        System.out.println(result);
    }

    public static String countNumbers(List<Double> data) {
        int UniqueCount = 0, duplicateCount = 0, zeroCount = 0, evenCount = 0, oddCount = 0;

        List<Double> unique = data.stream().distinct().toList();
        for (int i = 0; i < unique.size(); i++) {
            int countUn = 0;
            for (int j = 0; j < data.size(); j++) {
                if (unique.get(i).equals(data.get(j))) {
                    countUn++;
                }
            }
            if (countUn > 1) {
                duplicateCount++;
            } else {
                UniqueCount++;
            }
        }

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == 0) {
                zeroCount++;
            }
            if (data.get(i) % 2 == 0 && data.get(i) != 0) {
                evenCount++;
            } else if(data.get(i) != 0){
                oddCount++;
            }

        }

        return UniqueCount + ", " + duplicateCount + ", " + zeroCount + ", " + evenCount + ", " + oddCount;
    }

    public static List<Double> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Gson gson = new Gson();
        List<Double> data = gson.fromJson(input, List.class);
        return data;
    }
}


/**
 * У вас есть переменная data которая содержит входные пользовательские данные.
 *
 * data - список из элементов числел типа double (Double)
 *
 * Напишите код, который находит количество:
 *
 * уникальных чисел
 * дублированных чисел
 * нулей
 * четных чисел (без 0)
 * нечетных чисел
 * Результат записать через запятую в переменную result.
 *
 * Формат записи в переменную result:
 *
 * uniqueCount, duplicateCount, zeroCount, evenCount, oddCount*/