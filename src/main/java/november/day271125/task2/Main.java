package november.day271125.task2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<String> data = readInput();
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < data.size(); i++) {
            if ((i + 1) < data.size() && data.get(i).equals(data.get(i + 1))) {
                count++;
            }else {
                result.append(data.get(i)).append(count);
                count = 1;
            }
        }
        System.out.println(result);
    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<String>>() {}.getType());
    }
}

/**У вас есть переменная data которая содержит входные пользовательские данные.

 data - список из элементов строки.

 Напишите код, который проходит по массиву data, и записывает символы вместе с числом их повторений в переменную result.*/