package year2026.august.day30;

/*Напишите метод, который принимает список целых чисел (List<Integer>)
 и возвращает новый List<Integer>, из которого удалены элементы, повторяющиеся
  подряд один за другим. Если одинаковые числа стоят в разных частях списка — их
  трогать не нужно (удаляются только те, что «слиплись» вместе).
  Если входящий список пустой, метод должен вернуть пустой список.
* */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 3, 4, 2, 3, 4, 5, 5, 5, 6, 6, 6, 6, 6, 8, 9, 9);

        System.out.println("Old");
        System.out.println("------------------------------------------------------");
        System.out.println(list);
        System.out.println("------------------------------------------------------");
        System.out.println("New");
        System.out.println(filtration(list));

    }


    public static List<Integer> filtration(List<Integer> list) {

        if (list.size() == 0) {
            return list;
        }

        List<Integer> newList = new ArrayList<>();
        newList.add(list.get(0));

        for (int i = 1 ; i < list.size(); i++) {

                if (list.get(i).equals(newList.get(newList.size() - 1))) {
                    continue;
                }
                newList.add(list.get(i));
            }

        return newList;
    }
}
