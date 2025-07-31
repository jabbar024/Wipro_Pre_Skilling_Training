package Day_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter file = new FileWriter(new File("E:\\QSpider Java\\File_or_Practices.txt"));
		
		file.write("Hey! It's day 11 of learning Java");
		file.write("Today topic is Collection and File Handaling ");
		
		file.close();
	}

}
