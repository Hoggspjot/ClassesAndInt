package year2026.september.day02;

/*
* Напишите метод, который принимает список строк (List<String>),
*  делает с ними три простых действия через стрим и возвращает
* новый список:Оставляет только те строки, которые длиннее 3 символов.
* Переводит все оставшиеся строки в верхний регистр
* (с заглавных букв, например: apple -> APPLE).Собирает результат обратно в List<String>.*/


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("cat", "banana", "dog", "apple", "go");

        System.out.println("Before: ");
        System.out.println(list);
        System.out.println("----------------------------");
        System.out.println("After:");
        System.out.println(filtration(list));
    }

    public static List<String> filtration(List<String> list) {

        return list.stream().filter(x -> x.length() > 3).map(String::toUpperCase).collect(Collectors.toList());

    }

}
