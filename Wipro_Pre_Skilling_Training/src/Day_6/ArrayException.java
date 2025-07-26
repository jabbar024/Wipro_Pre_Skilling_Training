package Day_6;

public class ArrayException 
{
	public static void main(String[] args) 
	{
		int index = 9 ;
		int[] array = {1,2,3,4,5,6};
		try
		{
		
			System.out.println("Index "+index+" element is : "+array[index]);
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Fetching Gone Wrong");
		}
		finally
		{
			System.out.println("Operation is Completed...");
		}
		
	}

}
