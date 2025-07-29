package Day_8.ArrayList;

import java.util.*;

public class AddFemaleAfterOneMale 
{
	
	public static ArrayList<Student> maleAfterFenale(ArrayList<Student> ml, ArrayList<Student> fl)
	{
		ListIterator<Student> iml = ml.listIterator();
		ListIterator<Student> ifl = fl.listIterator();
		
		while(iml.hasNext() && ifl.hasNext())
		{
			iml.next();
			iml.add(ifl.next());
		}
		
		return ml;
		
	}
	public static void main(String args[])
	{
		ArrayList<Student> ml = new ArrayList<>();
		ml.add(new Student("Suraj", 95.98, 2024, "Electronic & Telicomunication"));
		ml.add(new Student("Jabbar", 85.98, 2024, "Information Technology"));
		ml.add(new Student("Bhau", 86.98, 2024, "Information Technology"));
		ml.add(new Student("Ketan", 95.98, 2024, "Information Technology"));
		ml.add(new Student("Aditya", 15.80, 2024, "Information Technology"));
		ml.add(new Student("Kunal", 30.90, 2024, "Information Technology"));
		ml.add(new Student("Kedar", 85.98, 2020, "Electronic & Telicomunication"));
		ml.add(new Student("Rishab", 85.98, 2021, "B Com"));
		ml.add(new Student("Prajwal", 85.98, 2019, "B Com"));
		ml.add(new Student("Tejas", 85.98, 2004, "Rubber Technology"));
		
		
		
		ArrayList<Student> fl = new ArrayList<>();
		fl.add(new Student("Ananya", 95.98, 2024, "Electronic & Telecommunication"));
		fl.add(new Student("Ishita", 85.98, 2024, "Information Technology"));
		fl.add(new Student("Meera", 86.98, 2024, "Information Technology"));
		fl.add(new Student("Pooja", 95.98, 2024, "Information Technology"));
		fl.add(new Student("Radha", 15.80, 2024, "Information Technology"));
		fl.add(new Student("Sneha", 30.90, 2024, "Information Technology"));
		fl.add(new Student("Nandini", 85.98, 2020, "Electronic & Telecommunication"));
		fl.add(new Student("Tanvi", 85.98, 2021, "B Com"));
		fl.add(new Student("Riya", 85.98, 2019, "B Com"));
		fl.add(new Student("Shruti", 85.98, 2004, "Rubber Technology"));

		
		ArrayList<Student> ans = new ArrayList<>(maleAfterFenale(ml, fl));
		
		System.out.println(ans);
	}

}
