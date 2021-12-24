package chapterThree;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sadam", "Hussein", 250);
        Employee employee2 = new Employee("Adam", "Ola", 5000);
        Date date1 = new Date(13,11,2020);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day ");
        date1.setDay(input.nextInt());
        System.out.println(date1.getDay());



        System.out.println(employee2.increaseSalary());
    }


}
