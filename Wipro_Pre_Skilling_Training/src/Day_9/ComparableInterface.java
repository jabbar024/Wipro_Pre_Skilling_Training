package Day_9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable
{
	private String name ;
	private String address ;
	private double salary ;
	private LocalDate  joiningDate;
	
	public Employee(String name, String address, double salary, LocalDate date) 
	{
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.joiningDate = date ;
		
	}
	
	
	public String toString()
	{
		return "[Name= "+name+", Address= "+address+", Salary= "+salary+", Joining Date= "+joiningDate+"]" ;
	}
	
	public int compareTo(Object o)
	{
		Employee e = (Employee) o ;
		
		if(this.joiningDate.isBefore(e.joiningDate))
		{
			return 1 ;
		}
		else if(this.joiningDate.isAfter(e.joiningDate))
		{
			return -1 ;
		}
		else
		{
			return 0 ;
		}
		
	}
}

public class ComparableInterface 
{
	public static void main(String[] args)   
	{
		Employee e1 = new Employee("Pratik", "Sinner", 120000, LocalDate.now()) ;
		Employee e2 = new Employee("Jabbar", "Nashik", 120000, LocalDate.now().plus(1, ChronoUnit.DAYS)) ;
		Employee e3 = new Employee("Ketan", "Jalgon", 120000, LocalDate.now().plus(5, ChronoUnit.DAYS)) ;
		
		ArrayList<Employee> emp = new ArrayList<Employee>() ;
		emp.add(e1) ;
		emp.add(e2) ;
		emp.add(e3) ;
		
		Collections.sort(emp) ;
		
		System.out.println(emp);
		
		ArrayList<Integer> num = new ArrayList<>() ;
		
		num.add(89) ;
		num.add(9) ;
		num.add(8) ;
		num.add(85) ;
		num.add(34) ;
		num.add(6) ;
		num.add(99) ;
		num.add(100) ;
		
		Collections.sort(num);
		System.out.println(num);

		
	}
}
