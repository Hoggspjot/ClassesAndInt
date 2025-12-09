package november.day011125.task2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        boolean result = data.stream().allMatch(x -> x % 2 != 0);

        System.out.println(result);
    }

    public static List<Integer> readInput() {
        List<Integer> data = null;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            Gson gson = new Gson();
            data = gson.fromJson(input, new TypeToken<List<Integer>>(){}.getType());
        }
        scanner.close();

        return data;
    }
}

/*У вас есть переменная data, которая содержит входные пользовательские данные.

data - список из элементов целых чисел.

Напишите код, который определяет все ли числа в списке data нечетные и записывает логический результат в переменную result.*/