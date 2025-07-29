package Day_8.Comparator;

public class Employee 
{
	int empNo;
	 String name;
	 String job;
	 public int hireDate;
	 double sal;
	 
	 public Employee()
	 {
		 
	 }
	 
	 public Employee(int empNo, String name, String job, int hireDate, double sal)
	 {
		 this.empNo = empNo;
		 this.name = name ;
		 this.job = job;
		 this.hireDate = hireDate;
		 this.sal = sal;
	 }
	 
	 
	public String toString() {
		return "[empNo=" + empNo + ", name=" + name + ", job=" + job + ", hireDate=" + hireDate + ", sal="
				+ sal + "]";
	}

}
