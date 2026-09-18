package year2026.september.day18;

import java.util.Arrays;
import java.util.List;

/**
 * Условие:Представьте, что пользователь регистрируется на сайте,
 * и вам нужно проверить список паролей, которые он пробовал ввести.
 * Напишите метод, который принимает список строк-паролей (List<String>) и проверяет:
 * правда ли, что ВСЕ пароли в этом списке имеют длину больше или равную 6 символам?
 * Метод должен возвращать boolean (true или false).
 * Если список пустой, метод должен вернуть true (так как нарушителей правил нет).
* */


public class Main {
    public static void main(String[] args) {

        List<String> passwords1 = Arrays.asList("qwerty", "1234567", "password123");
        List<String> passwords2 = Arrays.asList("qwerty", "123", "password123");

        System.out.println(check(passwords1));
        System.out.println(check(passwords2));

    }

    static boolean check(List<String> list) {

        return list.stream()
                .allMatch(x -> x.length() >= 6);

    }
}
