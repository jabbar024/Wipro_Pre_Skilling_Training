package Day_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite 
{
	public static void main(String[] args)  
	{
		File file = new File("E:\\QSpider Java\\File_or_Practices.txt") ;
		System.out.println(file);
		
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file)) ;
			bw.write("A Hi, I am learning Java");
			bw.newLine();
			bw.write("Its my day 6 of learning java");
			bw.close();
			
			BufferedReader bf = new BufferedReader(new FileReader(file)) ;
			System.out.println(bf);
			
			int ch ;
			while((ch = bf.read()) != -1)
			{
				System.out.print((char)(ch));
			}

//			System.out.println(bf.readLine());
//			System.out.println(bf.readLine());
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
