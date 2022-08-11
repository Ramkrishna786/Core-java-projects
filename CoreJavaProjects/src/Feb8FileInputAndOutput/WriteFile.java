package Feb8FileInputAndOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class WriteFile 
{
	public static void main(String args[])
	{
		try 
		{
		FileInputStream fis= new FileInputStream("/Users/ram/JavaFiles/file1.txt");
		int data;
		while((data=fis.read())!=-1)
		{
			System.out.print((char)data);
		}
		
		
		fis.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
