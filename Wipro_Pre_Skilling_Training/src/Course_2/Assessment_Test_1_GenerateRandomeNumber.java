package Course_2;
import java.security.SecureRandom;
import java.util.Random; 

public class Assessment_Test_1_GenerateRandomeNumber 
{
	public static void main(String[] args) 
	{
		Random randomeNumber = new Random() ;
		System.out.println(randomeNumber.nextInt(150-140+1)+140);
	}

}
