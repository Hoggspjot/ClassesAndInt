package day241125.task1;

import com.google.gson.Gson;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Boolean> data = readInput();
        boolean result = allFalse(data);
        System.out.println(result);
    }

    public static boolean allFalse(List<Boolean> data) {
        return data.stream()
                .allMatch(x -> x == false);
    }

    public static List<Boolean> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean[] array = new Gson().fromJson(input, boolean[].class);
        List<Boolean> data = new ArrayList<>();
        for (boolean value : array) {
            data.add(value);
        }
        return data;
    }
}


/*У вас есть переменная data которая содержит входные пользовательские данные.

data - список из элементов логического типа.

Напишите код, который проверяет все ли элементы в списке false и записывает логический результат в переменную result.*/