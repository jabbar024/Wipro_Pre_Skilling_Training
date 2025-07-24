package Day4;

import java.util.Scanner;

public class AttendanceProgram 
{
    public static void markAttendance(Scanner sc) 
    {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        sc.nextLine(); // consume newline

        String[] students = new String[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter student name: ");
            students[i] = sc.nextLine();
            System.out.print("Mark Present/Absent for " + students[i] + ": ");
            status[i] = sc.nextLine();
        }

        System.out.println("\n--- Attendance Report ---");
        
        for (int i = 0; i < n; i++) 
        {
            System.out.println(students[i] + " - " + status[i]);
        }
    }
    
    public static void main(String[] args) 
    {
		markAttendance(new Scanner(System.in));
	}
}
