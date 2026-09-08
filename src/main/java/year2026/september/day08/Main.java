package year2026.september.day08;

/*Напишите метод, который принимает список строк (List<String>)
 и с помощью стрима считает суммарную длину всех строк, которые
  начинаются на букву "A" (регистр важен, только заглавная "A").
  Метод должен возвращать обычное число int (общую сумму длин).
  Если подходящих строк нет, метод должен вернуть 0.*/


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Apple", "Banana", "Apricot", "Cat", "Aeroplane");
        System.out.println(counter(words));
    }

    static int counter(List<String> list) {

       return list.stream()
                .filter(x -> x.startsWith("A"))
                .map(x -> x.length())
                .reduce(0, (ac, x) -> ac + x);

    }
}
