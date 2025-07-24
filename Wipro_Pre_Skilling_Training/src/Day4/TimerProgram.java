package Day4;

public class TimerProgram 
{
    public static void runTimer() 
    {
        String[] tasks = {
            "Drink Water",
            "Do Java Programs",
            "Complete your Lunch",
            "Watch Movie",
            "Practice Codes"
        };
        double[] times = {11.00, 12.00, 13.00, 14.00, 15.00};
        String period;

        for (int i = 0; i < times.length; i++) {
            period = (times[i] < 12.00) ? "AM" : "PM";
            System.out.println("Now the time is : " + times[i] + " " + period);
            System.out.println("So your task is : " + tasks[i]);
            System.out.println("---------------------------");
        }
    }
    
    public static void main(String[] args) 
    {
		runTimer();
	}
}