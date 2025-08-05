public class Employee {

    // Variáveis de instância
    private String firstName;
    private String surname;
    private double salary;

    // Construtor de Employee
    public Employee(String firstName, String surname, double salary) {

        this.firstName = firstName;
        this.surname = surname;
        this.salary = salary;
    }

    // Método que define o first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Método que retorna o first name
    public String getFirstName() {
        return firstName;
    }

    // Método que define o surname
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Método que retorna o surname
    public String getSurname() {
        return surname;
    }

    // Método que define o salary
    public void setSalary(double salary) {
        if(salary < 0)
            salary = 0.0;
        this.salary = salary;
    }

    // Método que retorna salary
    public double getSalary() {
        return salary*12;
    }

    // Método que aumenta o salario
    public double getIncreaseSalary(double salary) {
        return (salary * 0.10) + salary;
    }

}
