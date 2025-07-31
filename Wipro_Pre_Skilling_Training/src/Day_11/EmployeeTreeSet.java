package Day_11;

import java.util.*;

public class EmployeeTreeSet 
{

	public static void main(String[] args) 
	{
		TreeSet<Employee> ls = new TreeSet<>();
		
		ls.add(new Employee(1001,"Jabbar","Manager",70000));
		ls.add(new Employee(1011,"Bhau","Salesman",89000));
		ls.add(new Employee(2341,"Ketan","Develop",67300));
		ls.add(new Employee(1781,"Aditya","Sql Developer", 90000));
		ls.add(new Employee(2001,"Kedar","DevOpps",  100000));
		ls.add(new Employee(5001,"Shubham","Java Developer", 278354));
		ls.add(new Employee(1101,"Sandip","Architect", 998769));
		ls.add(new Employee(8998,"Suraj","CEO", 353455));
		ls.add(new Employee(4567,"Sartak","Team Lead", 938758));
		ls.add(new Employee(2312,"Ashish","Product Owner", 99833));
		ls.add(new Employee(1989,"Kunal","jr Develeoper", 37627));
		ls.add(new Employee(5685,"Tejas","Hr", 70000));
		ls.add(new Employee(3333,"Vedant","Business Analyst", 47500));
		
		System.out.println(ls);
		
	}

}
