package day251025.task4;

public class Main {
    public static void main(String[] args) {
        // Создаем студента: при создании сначала сработает конструктор Person, затем Student
        Student anna = new Student("Анна", 3);
    }
}


class Person {

    public Person(String humanName) {
        System.out.println("Создан человек: "+humanName);
    }
}

class Student extends Person {

    public Student(String studentName, int studentGrade) {
        super(studentName);
        System.out.println("Создан студент: "+studentName+", класс: "+studentGrade);
    }
}