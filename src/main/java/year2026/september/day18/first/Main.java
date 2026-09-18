package year2026.september.day18.first;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Иван", "+7-999-111-22-33");
        phoneBook.put("Елена", "+7-999-444-55-66");
        phoneBook.put("Петр", "+7-999-777-88-99");


        System.out.println(phoneSearch(phoneBook, "Иван"));
        System.out.println( phoneSearch(phoneBook, "Василий"));

    }

    static String phoneSearch(Map<String, String> map, String name) {

        String result = map.get(name);
        if ( result != null && !result.isEmpty()) {
            return result;
        } else {
            return "Контакт не найден";
        }
    }
}
