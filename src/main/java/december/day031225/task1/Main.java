package december.day031225.task1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Commodity commodity = new Commodity();
        commodity.name = scanner.nextLine();
        commodity.cost = scanner.nextInt();

        Purchase purchase = new Purchase();
        purchase.name = commodity;
        purchase.num = scanner.nextInt();
       // scanner.nextLine();
        purchase.show();


        System.out.println();
        commodity.cost = scanner.nextInt();

        purchase.show();
        scanner.close();
    }
}

class Commodity {
    String name;
    int cost;

    public void show() {
        System.out.printf("Наименование товара: %s\n" +
                "Цена товара: %d\n",name, cost);
    }
}

class Purchase{
    Commodity name;
    int num;

    private int getCost() {
        return name.cost * num;
    }

    public void show() {
        System.out.printf("Наименование товара: %s\n" +
                "Цена товара: %d\n" +
                "Количество: %d\n" +
                "Стоимость покупки: %d\n",name.name,name.cost,num,getCost());
    }
}