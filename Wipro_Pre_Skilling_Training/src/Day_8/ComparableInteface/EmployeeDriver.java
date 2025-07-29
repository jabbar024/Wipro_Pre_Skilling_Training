package Day_8.ComparableInteface;

import java.util.*;

public class EmployeeDriver 
{

	public static void main(String[] args) 
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
		
		Comparator<Employee> cmp = new Comparator<>() 
		{
			public int compare(Employee e1, Employee e2)
			{
				return e1.name.compareTo(e2.name);
			}
			
			
		};
		
		ls.sort(cmp);
		
		System.out.println(ls);
		
		
	}

}
