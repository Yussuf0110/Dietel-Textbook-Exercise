package chapterThree;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sadam", "Hussein", 250);
        Employee employee2 = new Employee("Adam", "Ola", 5000);

        System.out.println(employee2.increaseSalary());
    }
}
