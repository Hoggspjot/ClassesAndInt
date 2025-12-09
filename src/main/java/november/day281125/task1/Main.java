package november.day281125.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> grid = readInput();
        Integer result = 0;
        if (grid.size() != grid.get(0).size()) {
            result = -1;
        } else {
            for (int i = 0; i < grid.size(); i++) {
                for (int j = 0; j < grid.get(i).size(); j++) {
                    if (i == j || (i + j == grid.size() - 1)) {
                        result += grid.get(i).get(j);
                    }
                }
            }
            if (grid.size() % 2 != 0) {
                result += grid.get(grid.size() / 2).get(grid.size() / 2);
            }
        }
        System.out.println(result);
    }

    public static List<List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return new Gson().fromJson(input, new TypeToken<List<List<Integer>>>() {}.getType());
    }
}

/**У вас есть переменная grid которая содержит входные пользовательские данные.

 grid - двумерный список из элементов целых чисел.

 Напишите код, который находит сумму всех чисел по двум диагоналям двумерного списка grid и записывает результат в переменную result.

 Обратите внимание на то, что ваш код должен работать для любого размера двухмерного массива grid например: 2х2, 3х3, 4х4 и тд...

 Важно!

 Вам необходимо убедиться в том, что размер списка по высоте и ширине одинаковый!
 Если размер списка по высоте и ширине разный, тогда записываем -1 в переменную result.
 Например:

 (
 1
 +
 1
 +
 1
 )
 +
 (
 1
 +
 1
 +
 1
 )
 =
 6
 (1+1+1)+(1+1+1)=6*/