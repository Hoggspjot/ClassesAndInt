package december.day031225.task3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("ERROR");
        } else {
            Employee[] employees = new Employee[size];

            for (int i = 0; i < employees.length; i++) {
                employees[i] = new Employee(
                        scanner.next(),
                        scanner.next(),
                        scanner.nextInt(),
                        scanner.nextDouble()
                );
                if (employees[i].isPensioner()) {
                    employees[i].setSalary(90000);
                }
            }
            for (Employee employee : employees) {
                employee.show();
                System.out.println();
            }


        }
    }
}

class Employee {
   private String surname;
   private String sex;
   private int age;
   private double salary;

    public Employee(String surname, String sex, int age, double salary) {
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

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