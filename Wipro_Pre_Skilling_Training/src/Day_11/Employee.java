package Day_11;

import java.util.Objects;

public class Employee implements Comparable 
{
	int empNo;
	String name;
	String job;
	double salary;

	
	public Employee()
	{
		
	}
	
	public Employee(int empNo, String name, String job, double salary)
	{
		this.empNo = empNo;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "["+"Employee No = "+empNo+" Name = "+name+" Job = "+job+" Salary = "+salary+"]";
	}

	public boolean equals(Object o)
	{
		System.out.println("Equals");
		Employee emp = (Employee) o;
		if(empNo==emp.empNo && name==emp.name && job==emp.job && salary==emp.salary)
		{
			return true;
		}
		return false;
	}
	
	public int hashCode()
	{
		System.out.println("HashCode");
		return empNo+name.hashCode()+job.hashCode();
	}


	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		
		return empNo>emp.empNo?1 : empNo<emp.empNo? -1:0;
	}
	
	
}
