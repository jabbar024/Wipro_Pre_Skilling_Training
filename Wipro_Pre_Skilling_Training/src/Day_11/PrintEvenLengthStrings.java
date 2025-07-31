package Day_11;
import java.util.List;
import java.util.ArrayList;

public class PrintEvenLengthStrings 
{
	public static void printString(List ls)
	{
		int count = 0 ;
		for(int i=0; i<ls.size(); i++)
		{
			String str = (String)(ls.get(i));
			if(str.length()%2==0)
			{
				System.out.println(str);
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("Even Length String Not Present.....");
		}
	}
	public static void main(String args[])
	{
		List ls = new ArrayList();
		ls.add("a");
		ls.add("ab");
		ls.add("abc");
		ls.add("abcd");
		ls.add("abcdef");
		ls.add("abcdefg");
		ls.add("abcdefgh");
		ls.add("abcdefghi");
		ls.add("abcdefghij");
		ls.add("abcdefghijk");
		
		printString(ls);
		
	}
	

}
