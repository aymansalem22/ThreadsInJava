package trainoop3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int exit = 1;
        while (exit == 1) {
            System.out.println("enter your name: ");
            String name = sc.next();
            System.out.println("enter your age:  ");
            int age = sc.nextInt();
            System.out.println("enter your salary");
            double salary = sc.nextDouble();
            System.out.println("has bonus ( yes or no)");
            boolean hasbonus = sc.next().equals("yes");
            if (hasbonus) {
                System.out.println("enter your bonus: ");
                double bonus = sc.nextDouble();
                Manager manager = new Manager(bonus, salary, age, name);
                employees.add(manager);
            } else {
                Employee employee = new Employee(salary, age, name);
                employees.add(employee);
            }
            System.out.println("please enter 1 to add more, 0 to exit");
            exit = sc.nextByte();

        }

        System.out.println("list of employees");
        display(employees);
        System.out.println("*******sum age of employees");
        System.out.println(sumAge(employees));
        System.out.println("*******avg age of employees");
        System.out.println(avgAge(employees));
        System.out.println("*******sum salary of employees");
        System.out.println(sumSalary(employees));
        System.out.println("*******avg salary of employees");
        System.out.println(avgSalary(employees));
        Collections.sort(employees);
        System.out.println("after sort :list of employees");
        display(employees);
        Collections.reverse(employees);
        System.out.println("after sort desc :list of employees");
        display(employees);
    }

    public static void display(List<Employee> employees) {
        employees.forEach(employee1 -> {
            System.out.println(employee1);
        });
    }

    public static int sumAge(List<Employee> employees) {
        int sum = 0;
        for (Employee employee1 : employees) {
            sum += employee1.getAge();
        }
        return sum;

    }

    public static int avgAge(List<Employee> employees) {
        return (employees.isEmpty()) ? 0
                : sumAge(employees) / employees.size();

    }

    public static double sumSalary(List<Employee> employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.totalSalary();
        }
        return sum;
    }

    public static double avgSalary(List<Employee> employees) {
        return (employees.isEmpty()) ? 0
                : sumSalary(employees) / employees.size();

    }

}
