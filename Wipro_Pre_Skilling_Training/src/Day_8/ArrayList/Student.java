package Day_8.ArrayList;

public class Student 
{
	String name;
	double persentage;
	int yop;
	String branch;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, double persentage, int yop, String branch) {
		super();
		this.name = name;
		this.persentage = persentage;
		this.yop = yop;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", persentage=" + persentage + ", yop=" + yop + ", branch=" + branch + "] ";
	}
	
	
	

}
