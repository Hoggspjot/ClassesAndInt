package december.day091225;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> prices = readInput();
        int result = calculateDifference(prices);
        System.out.println(result);
    }

    public static int calculateDifference(List<Integer> prices) {
        int sum = -1 * prices.get(0);
        for (int i = 1; i < prices.size(); i++) {
            if (i % 2 != 0) {
                sum += prices.get(i);
            } else {
                sum -= prices.get(i);
            }
        }
        return sum;
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<Integer>>() {}.getType());
    }
}