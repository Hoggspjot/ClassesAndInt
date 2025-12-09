package december.day091225;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> prices = readInput();
        int result = calculateDifference(prices);
        System.out.println(result);
    }

    public static int calculateDifference(List<Integer> prices) {

        return IntStream.range(0, prices.size())
                .map(i -> prices.get(i) % 2 != 0 ? prices.get(i) : -prices.get(i)).sum();
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<Integer>>() {}.getType());
    }
}