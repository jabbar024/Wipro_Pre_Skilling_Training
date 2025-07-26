package Day_6;

public class ExceptionExample 
{

	public static void main(String[] args) 
	{
		int num = 10 ;
		
		try
		{
			int res = num/0;
			System.out.println("Divisin Gone Right");
			         
		}catch(ArithmeticException e)
		{
			System.out.println("Division Gone Wrong");
		}
		finally
		{
			System.out.println("Operation is Completed...");
		}
		
	}
}
