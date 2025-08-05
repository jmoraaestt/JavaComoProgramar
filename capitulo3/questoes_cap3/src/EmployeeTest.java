import java.util.Scanner;

public class EmployeeTest {
    public static void main(String args[]) {

        Employee employee1 = new Employee("Julia", "Toledo", 2300.00);
        Employee employee2 = new Employee("Maria", "Clara", 1800.00);

        System.out.printf("Name: %s %s\nSalary Annual: $%.2f\n\n", employee1.getFirstName(), employee1.getSurname(), employee1.getSalary());
        System.out.printf("Name: %s %s\nSalary Annual: $%.2f\n\n", employee2.getFirstName(), employee2.getSurname(), employee2.getSalary());
        System.out.print("--- Salary increase ---\n");
        System.out.printf("Name: %s %s\nSalary Annual: %.2f\n\n", employee1.getFirstName(), employee1.getSurname(), employee1.getIncreaseSalary(employee1.getSalary()));
        System.out.printf("Name: %s %s\nSalary Annual: %.2f\n", employee2.getFirstName(), employee2.getSurname(), employee2.getIncreaseSalary(employee2.getSalary()));
    }
}
