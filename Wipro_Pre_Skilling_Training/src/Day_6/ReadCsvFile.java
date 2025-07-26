package Day_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsvFile 
{
	public static void main(String args[])
	{
		File file = new File("E:\\QSpider Java\\data.csv") ;
		
		try 
		{
			FileReader fileReader = new FileReader(file) ;
			BufferedReader bf = new BufferedReader(fileReader) ;
			
			String str = bf.readLine() ;
			while(str != null)
			{
				System.out.println(str);
				str = bf.readLine() ;
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
