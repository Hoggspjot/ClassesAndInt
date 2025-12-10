package november.day051125.task1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputData inputData = readInput();
        int num = inputData.getNum();

        List<Integer> data = inputData.getData();

        boolean result = data.stream().allMatch(x -> x > num);


        System.out.println(result);
    }

    public static InputData readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
            String[] values = input.split(" \\| ");
            int num = Integer.parseInt(values[0]);
            String json = values[1];
            Gson gson = new Gson();
            List<Integer> data = gson.fromJson(json, new TypeToken<List<Integer>>(){}.getType());
            return new InputData(num, data);
        }
        scanner.close();
        return null;
    }
}

class InputData {
    private int num;
    private List<Integer> data;

    public InputData(int num, List<Integer> data) {
        this.num = num;
        this.data = data;
    }

    public int getNum() {
        return num;
    }

    public List<Integer> getData() {
        return data;
    }
}