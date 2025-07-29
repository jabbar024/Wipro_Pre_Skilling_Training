package Day_8.Comparator;

import java.util.*;

public class EmployeeDriver 
{
	
	public static void print(ArrayList<Employee> ls)
	{
		for(Employee e : ls)
		{
			System.out.println(e);
		}
		
		System.out.println();
	}
	
	public static Comparator<Employee> sortByEmpNo()
	{
		Comparator<Employee> c = new Comparator<Employee>() {
			
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.empNo > o2.empNo? 1 : o1.empNo < o2.empNo? -1 : 0;
			}
			
		};
		
		return c;
	}
	
	
	public static Comparator<Employee> sortByName()
	{
		Comparator<Employee> c = new Comparator<Employee>() {
			
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
		};
		
		return c;
	}
	
	
	public static Comparator<Employee> sortByHireDate()
	{
		Comparator<Employee> c = new Comparator<Employee>() {
			
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.hireDate > o2.hireDate? 1 : o1.hireDate < o2.hireDate? -1 : 0;
			}
			
		};
		
		return c;
	}
	
	
	
	public static void main(String args[])
	{
		ArrayList<Employee> ls = new ArrayList<>();
		
		ls.add(new Employee(1001,"Jabbar","Manager", 2024, 70000));
		ls.add(new Employee(1011,"Bhau","Salesman", 2004, 89000));
		ls.add(new Employee(2341,"Ketan","Develop", 2010, 67300));
		ls.add(new Employee(1781,"Aditya","Sql Developer", 2012, 90000));
		ls.add(new Employee(2001,"Kedar","DevOpps", 2015, 100000));
		ls.add(new Employee(5001,"Shubham","Java Developer", 2022, 278354));
		ls.add(new Employee(1101,"Sandip","Architect", 2011, 998769));
		ls.add(new Employee(8998,"Suraj","CEO", 2001, 353455));
		ls.add(new Employee(4567,"Sartak","Team Lead", 2023, 938758));
		ls.add(new Employee(2312,"Ashish","Product Owner", 2014, 99833));
		ls.add(new Employee(1989,"Kunal","jr Develeoper", 2013, 37627));
		ls.add(new Employee(5685,"Tejas","Hr", 2001, 70000));
		ls.add(new Employee(3333,"Vedant","Business Analyst", 2001, 47500));
		
		
		print(ls);
		
		ls.sort(sortByName());
		
		print(ls);
		
		
		
	}

}
