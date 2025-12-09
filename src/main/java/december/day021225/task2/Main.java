package december.day021225.task2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Abiturient person = new Abiturient();
        person.surname = scan.next();
        person.name = scan.next();
        person.math = scan.nextInt();
        person.physics = scan.nextInt();
        person.lang = scan.nextInt();
        System.out.printf("%.1f\n", person.average());
        person.print();
    }
}

class Abiturient {
    String surname;
    String name;
    int math;
    int physics;
    int lang;

    public double average() {
        return (double) (math + physics + lang) / 3;
    }

    public void print() {
        System.out.printf("%s %s математика = %d физика = %d язык = %d средний балл = %.1f",surname,name,math,physics,lang, average());
    }
}