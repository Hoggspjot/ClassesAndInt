package year2026.september.day10;

/*Условие:Напишите метод, который принимает список строк (List<String>)
и с помощью стрима находит длину самого длинного слова.
Метод должен возвращать int (саму максимальную длину).
Если список пустой, метод должен вернуть 0.*/

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe");

        System.out.println(search(words));

    }

    static int search(List<String> list) {
        return list.stream().map(String::length).max(Integer::compareTo).orElse(0);
    }
}
