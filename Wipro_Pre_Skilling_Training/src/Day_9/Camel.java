package Day_9;

import java.util.Arrays;

public class Camel 
{

	public static String removeSpecialCharacter(String word)
	{
		String tempStr = "" ;
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.charAt(i) ;
			if((ch<='z' && ch>='a')|| (ch<='Z' && ch>='A'))
			{
				tempStr += ch ;
			}
		}
		return tempStr ;
	}
	
	public static void main(String[] args) 
	{
		String str = "PRA!Tik ASHok sh^elar A#$bc xyz" ;
		
		
		String [] arr = str.split(" ") ;
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = removeSpecialCharacter(arr[i]) ;
		}
		
		System.out.println(Arrays.toString(arr));

		
		String ans = arr[0].toLowerCase() ;
		
		for(int i=1; i<arr.length; i++)
		{
			ans = ans+arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1).toLowerCase() ;
			
		}
		
		System.out.println(ans);
		
			
	}
}
