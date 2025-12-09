package november.day081125.task2;

import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<String> data = readInput();
        String result;

        Collections.sort(data);

        result = String.join(", ", data);

        System.out.println(result);
    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
            Gson gson = new Gson();
            String[] dataArray = gson.fromJson(input, String[].class);
            return Arrays.asList(dataArray);
        }
        scanner.close();
        return null;
    }
}

/*У вас есть переменная data, которая содержит входные пользовательские данные.

data - список из строковых элементов.

Напишите код, который сортирует строковые элементы списка data в порядке возрастания и записывает результат через запятую в переменную result.*/