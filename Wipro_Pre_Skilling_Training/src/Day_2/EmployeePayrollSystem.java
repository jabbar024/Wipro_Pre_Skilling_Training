package Day_2;

abstract class EmployeeDetails
{
	private String name ;
	private int id ;
	
	public EmployeeDetails(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public abstract double calculateSalary();
	
	public void displayDetails()
	{
		System.out.println("Employee Name : "+name);
		System.out.println("Employee ID : "+id);
	}
}

class FullTimeEmployee extends EmployeeDetails
{
	private double monthlySalary ;

	public FullTimeEmployee(String name, int id, double monthlySalary) 
	{
		super(name, id);
		this.monthlySalary = monthlySalary;
	}
	
	public double  calculateSalary()
	{
		return monthlySalary ;
	}
	
}


class PartTimeEmployee extends EmployeeDetails
{
	private int hour ;
	private double payParHour ;

	public PartTimeEmployee(String name, int id, int hour, double payPerHour ) 
	{
		super(name, id);
		this.hour = hour;
		this.payParHour = payPerHour ;
	}
	
	public double  calculateSalary()
	{
		return hour * payParHour * 30 ;
	}
	
}
public class EmployeePayrollSystem 
{
	
	
	public static void main(String[] args) 
	{
		EmployeeDetails e ;
		
		e = new FullTimeEmployee("Jabbar", 10, 50000) ;
		e.displayDetails() ;
		System.out.println(e.calculateSalary());
		
		e = new PartTimeEmployee("Jabbar", 10, 8, 300) ;
		e.displayDetails();
		System.out.println(e.calculateSalary());
		
	}
	
}
