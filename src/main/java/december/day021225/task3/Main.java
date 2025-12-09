package december.day021225.task3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        employee.surname = scanner.next();
        employee.sex = scanner.next();
        employee.age = scanner.nextInt();
        employee.salary = scanner.nextDouble();

        if (employee.isPensioner()) {
            employee.changeSalary(0.9);
        }
        employee.show();
    }
}

class Employee {
    String surname;
    String sex;
    int age;
    double salary;

    public boolean isPensioner() {
        if (sex.equals("male") && age >= 63) {
            return true;
        } else if (sex.equals("female") && age >= 58) {
            return true;
        } else {
            return false;
        }
    }

    public void changeSalary(double koef) {
        salary = salary * koef;
    }

    public void show() {
        System.out.printf("%s;%s;%d;%.0f",surname,sex,age,salary);
    }


}