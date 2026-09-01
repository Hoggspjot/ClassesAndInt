package year2026.september.day01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");

        Map<String, Integer> map = counter(list);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static Map<String, Integer> counter(List<String> list) {

        HashMap<String, Integer> map = new HashMap<>();

        if (list.size() == 0) {
            return map;
        }

        for (String str : list) {
            map.merge(str, 1, Integer::sum);
        }
        return map;
    }
}