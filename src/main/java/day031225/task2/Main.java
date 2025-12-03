package day031225.task2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Abiturient[] list = new Abiturient[3];
        list[0] = new Abiturient();
        list[1] = new Abiturient("Петров", "Андрей", 90, 70, 80);
        list[2] = new Abiturient("Алексиевич", "Анна");
        list[0].setSurname(scan.next());
        list[2].setPhysics(scan.nextInt());
        list[2].setMath(scan.nextInt());
        list[2].setLang(scan.nextInt());
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null) {
                System.out.printf("%s : %.1f\n", list[i].getSurname(), list[i].average());
            }
        }
    }
}

class Abiturient {
   private String surname;
   private String name;
   private int math;
   private int physics;
   private int lang;

    public Abiturient() {
    }

    public Abiturient(String surname, String name, int math, int physics, int lang) {
        this.surname = surname;
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.lang = lang;
    }

    public Abiturient(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getLang() {
        return lang;
    }

    public void setLang(int lang) {
        this.lang = lang;
    }

    public double average() {
        return (double) (math + physics + lang) / 3;
    }

    public void print() {
        System.out.printf("%s %s математика = %d физика = %d язык = %d средний балл = %.1f",surname,name,math,physics,lang, average());
    }
}
