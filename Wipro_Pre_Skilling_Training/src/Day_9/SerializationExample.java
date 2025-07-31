package Day_9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{	
	private int rollno;
	private String name;
	
	public Student(int rollno, String name) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	
	public Student() 
	{
		
	}
	
	
	
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public String toString() 
	{
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
//public class  Serialization_demo{
//	public static void main(String[] args) throws IOException {
//		Student1 std1 = new Student1();
//		std1.setRollno(10);
//		std1.setName("Afrid");
//		
//		try{
//			FileOutputStream out = new FileOutputStream("C://Users/Admin/Desktop/javafile.txt");
//			ObjectOutputStream output = new ObjectOutputStream(out);
//			output.writeObject(std1);
//			
//			System.out.println("Serialized data saved in file");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}		
//	}
//}


public class SerializationExample 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Student std1 = new Student();
		std1.setRollno(10);
		std1.setName("Jabbar");
		
		
		File f = new File("E:\\QSpider Java\\Java Object.txt") ;
		
		
		FileOutputStream file = new FileOutputStream(f) ;
		ObjectOutputStream ots = new ObjectOutputStream(file) ;
		ots.writeObject(std1);
		System.out.println("Successfully Write This Object = "+std1);

		
		FileInputStream file2 = new FileInputStream(f) ;
		ObjectInputStream ois = new ObjectInputStream(file2) ;
		Student s = (Student)(ois.readObject()) ;
		System.out.println("Successfully Read This Object = "+s);
	}

}
