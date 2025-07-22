package Day_2;

class Employee 
{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) 
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    public void displayDetails() 
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}

public class EmployeeSalaryIncapsulation  
{
    public static void main(String[] args) 
    {
        Employee emp = new Employee("Jabbar Shaikh", 101, 45000.0);

        emp.displayDetails();

        emp.setSalary(50000.0);
        System.out.println("\nUpdated Salary: ₹" + emp.getSalary());
    }
}
