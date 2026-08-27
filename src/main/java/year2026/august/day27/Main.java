package year2026.august.day27;

/*апишите метод, который принимает массив строк и возвращает самую
длинную строку из этого массива. Если массив пустой, метод должен
вернуть пустую строку "". Если есть несколько строк одинаковой
максимальной длины, верните любую из них.*/

public class Main {
    public static void main(String[] args) {

        String[] str = new String[4];

        str[0] = "первая строка";
        str[1] = "Вторая строка2";
        str[2] = "Третья строка = 3";
        str[3] = "Четрв стр";

        System.out.println(maxLength(str));
    }

    public static String maxLength(String[] strings) {
        String max = "";

        if (strings.length == 0) {
            return max;
        } else {

            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() >= max.length()) {
                    max = strings[i];
                }
            }
            return max;
        }
    }
}
