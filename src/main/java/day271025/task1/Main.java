package day271025.task1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Елена");

    }
}


class Person {

    public Person(String humanName) {
        System.out.println("Person создан: " + humanName);
    }
}

class Student extends Person {
    public Student(String studentName) {
        super(studentName);
        System.out.println("Student создан: "+studentName);
    }
}
