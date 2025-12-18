package december.day181225;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.google.gson.Gson;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> nums = readInput();
        int result = 0;
        List<Integer> dist = nums.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        if (dist.size() >= 3) {
            result = dist.get(2);
        } else {
            result = dist.stream().mapToInt(Integer::intValue).max().orElse(-1);
        }

        System.out.println(result);
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Type listType = new TypeToken<ArrayList<Integer>>(){}.getType();
        return new Gson().fromJson(input, listType);
    }
}


/**У вас есть переменная nums, которая содержит входные пользовательские данные.

 nums - список целых чисел.

 Напишите код, который принимает список целых чисел nums и записывает в переменную result третье уникальное максимальное число в этом списке. Если третье уникальное максимальное число не существует, то ваш код должен записать в переменную result максимальное число из списка.

 Примеры:

 Для nums = [3,2,1], будет: 1
 Объяснение: Первое уникальное максимальное число 3, второе 2, третье 1.

 Для nums = [1,2], будет: 2
 Объяснение: Первое уникальное максимальное число 2, второе 1. Третьего уникального максимального числа нет, поэтому возвращается максимальное число, равное 2.

 Для nums = [2,2,3,1], будет: 1
 Объяснение: Первое уникальное максимальное число 3, второе 2 (оба значения 2 считаются вместе, так как они одинаковы). Третье уникальное максимальное число 1.
 * */
