package Day_9;

import java.util.HashMap;

public class CountFrequencyUsingMap 
{
	public static void main(String[] args) 
	{
		String name = "Pratik Shelar  ";
		
		HashMap<Character, Integer> frequency = new HashMap<Character, Integer>(); 
		
		for(int i = 0; i<name.length() ; i++ )
		{
			char ch = name.charAt(i) ;
			
			if(frequency.get(ch) != null)
			{
				frequency.put(ch, frequency.get(ch)+1) ;
			}
			else
			{
				frequency.put(ch,1) ;
			}
		}
		
		
		System.out.println(frequency);
		
	}
}
