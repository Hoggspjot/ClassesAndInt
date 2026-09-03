package year2026.september.day3;


/*Напишите метод, который принимает список целых чисел (List<Integer>)
 и с помощью стрима делает три действия:
 Оставляет только нечётные числа (те, которые не делятся на 2 нацело).
 Возводит каждое оставшееся число в квадрат (умножает само на себя).
 Собирает результат в новый список List<Integer>.*/


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(10) + 1);
        }

        System.out.println("Before - ");
        System.out.println(list);
        System.out.println("-------------------------------------");
        System.out.println("After - ");
        System.out.println(threeAction(list));

    }

    static List<Integer> threeAction(List<Integer> list) {

        return list.stream().filter(x -> x % 2 != 0).map(x -> x * x).collect(Collectors.toList());

    }
}
