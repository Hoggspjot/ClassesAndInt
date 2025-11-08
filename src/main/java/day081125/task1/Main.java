package day081125.task1;


import com.google.gson.Gson;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> data = readInput();
        String result;
        StringBuilder sb = new StringBuilder();
        for (int i = data.size() - 1; i >= 0; i--) {
            sb.append(data.get(i));
            if (i != 0) {
                sb.append(", ");
            }
        }
        result = sb.toString();

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