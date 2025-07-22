package Day_2;

public class StudentDetails 
{
	String name;
	int rollNumber;
	String course;
	double marks;

	public StudentDetails(String name, int rollNumber, String course, double marks) 
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.course = course;
		this.marks = marks;
	}

	public void displayDetails() 
	{
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Course: " + course);
		System.out.println("Marks: " + marks);
	}
	
	public static void main(String[] args) {
        // Creating a Student object
		StudentDetails s1 = new StudentDetails("Jabbar Shaikh", 101, "Computer Science", 89.5);

        // Displaying student details
        s1.displayDetails();
    }

}
