package year2026.september.day03;

/*
* Вам поступает список текстовых строк.
* Каждая строка гарантированно содержит число в виде текста (например, "5", "12").
* Напишите метод, который с помощью одного стрима:
* Превратит каждую строку (String) в обычное число (Integer).
* Оставит только числа больше 10.
* Отсортирует оставшиеся числа по возрастанию.
* Соберет результат в новый список List<Integer>.*/


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        List<String> textNumbers = Arrays.asList("5", "25", "12", "3", "88", "14");

        System.out.println(sort(textNumbers));


    }

    static List<Integer> sort(List<String> list) {

        return list.stream()
                .map(Integer::parseInt)
                .filter(x -> x > 10)
                .sorted()
                .collect(Collectors.toList());

    }

}
