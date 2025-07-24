package Day4;

public class NameSorter 
{
	public static void sortNames() 
	{
		String[] names = { "Zoya", "Arjun", "Meera", "Rohan", "Amit" };

		// Bubble sort
		for (int i = 0; i < names.length - 1; i++) 
		{
			for (int j = 0; j < names.length - 1 - i; j++) 
			{
				if (names[j].compareToIgnoreCase(names[j + 1]) > 0) 
				{
					String temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;
				}
			}
		}

		System.out.println("--- Sorted Names ---");
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) 
	{
		sortNames();
	}
}