package day291025.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var pair = readInput();
        String message = pair.getFirst();
        int k = pair.getSecond();
        String result = "";

        if (k > 0) {
            for (int i = 0; i < k; i++) {
                System.out.print(message);
            }
        }

        if (k < 0 && (message.length() % Math.abs(k) == 0)) {
            int len = message.length() / Math.abs(k);
            result = message.substring(0, len);
        }

        if( k < 0 && (message.length() % Math.abs(k) != 0))
            result = "NO SOLUTION";

        System.out.println(result);
    }

    public static Pair<String, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" \\| ");
        String message = input[0];
        int k = Integer.parseInt(input[1]);
        return new Pair<>(message, k);
    }
}

class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}