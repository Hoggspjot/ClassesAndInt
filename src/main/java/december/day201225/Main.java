package december.day201225;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int height = readInput();
        List<List<Integer>> result = createTriangle(height);
        Gson gson = new Gson();
        String jsonResult = gson.toJson(result);
        System.out.println(jsonResult);
    }

    public static List<List<Integer>> createTriangle(int height) {
        int length = (height * 2) - 1;

        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < height; i++) {
           List<Integer> list  = new ArrayList<>(Collections.nCopies(length, 0));
            int center = length / 2;
            int left = center - i;
            int right = center + i;

            for (int j = left; j <= right; j++) {
                list.set(j, 1);
            }

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
 * У вас есть переменная height, которая содержит входные пользовательские данные.
 *
 * Напишите код, который создает двумерный массив с равнобедренным треугольником и записывает новый список в переменную result.
 *
 * 1 - тело треугольника
 * 0 - пустота.*/