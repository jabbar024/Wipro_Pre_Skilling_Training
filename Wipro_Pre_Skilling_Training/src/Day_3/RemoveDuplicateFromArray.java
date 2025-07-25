package Day_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Test
{
	public final void m()
	{
		
	}
}

public class RemoveDuplicateFromArray  extends Test
{
	public static void main(String[] args) 
	{
		int [] num = {1,2,2,2,3,1,1,4,5,6,10,7,8,9,4,6,7,8,9,4};
		
		List<Integer> list = new ArrayList<Integer>() ;
		
		for(int n : num)
		{
			if(! list.contains(n))
			{
				list.add(n) ;
			}
		}
		
		Integer [] num2 = list.toArray(new Integer[0]);
		System.out.println(Arrays.toString(num2));
		
		
		String s = "12345678" ;
		
		System.out.println(Arrays.toString(new StringBuilder(s).reverse().toString().split("")));
		
	}
	
	

}
