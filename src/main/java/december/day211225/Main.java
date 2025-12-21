package december.day211225;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = readInput();
        List<List<Integer>> result = createSquare(size);
        Gson gson = new Gson();
        String jsonResult = gson.toJson(result);
        System.out.println(jsonResult);
    }

    public static List<List<Integer>> createSquare(int size) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Integer> list = new ArrayList<>(Collections.nCopies(size, 1));
            lists.add(list);
        }
        return lists;
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }
}



/**
 * У вас есть переменная size, которая содержит входные пользовательские данные.
 *
 * Напишите код, который создает двумерный список с квадратом и записывает новый список в переменную result.
 *
 * 1 - тело квадрата.*/