package day271125.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String message = readInput();
        StringBuilder result = new StringBuilder();

        char[] chars = message.toCharArray();
        String lit = "";
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!isNum(chars[i])) {
                lit = String.valueOf(chars[i]);
            } else {
                num = Integer.parseInt(String.valueOf(chars[i]));
            }
            int j = 0;
            while (j < num) {
                result.append(lit).append(", ");
                j++;
            }
            num = 0;
        }
        String resultFin = result.substring(0, result.length() - 2);



        System.out.println(resultFin);
    }

    public static boolean isNum(char x) {
        try {
            Integer.parseInt(String.valueOf(x));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}


/**У вас есть переменная message которая содержит входные пользовательские данные.

 Напишите код, который:

 Читает строку message  вида: a2b3c1
 Воссоздает массив: a2b3c1 -> ["a","a","b","b","b","c"]
 Записывает воссозданный массив через запятую в переменную result.*/