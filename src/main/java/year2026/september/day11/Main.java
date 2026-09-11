package year2026.september.day11;

/*Условие:Напишите метод, который принимает список строк (List<String>)
и с помощью одного стрима:
 Оставляет только те строки, которые не являются пустыми (длина строки больше 0).
 Берет только первую букву от каждого слова.
 Собирает эти буквы в одну единую строку, разделяя их дефисом "-".
 Метод должен возвращать String.
 Если список пустой или в нем только пустые строки, метод должен вернуть пустую строку "".*/


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> words = Arrays.asList("Java", "", "Stream", "Awesome", "Task");
        System.out.println(getLetter(words));

    }

    static String getLetter(List<String> list) {

        return list.stream()
                .filter(x -> x.length() != 0)
                .map(x -> x.substring(0, 1))
                .collect(Collectors.joining("-"));
    }
}
