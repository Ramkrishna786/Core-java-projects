package Feb8FileInputAndOutput;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String args[])
	{
		try {
			FileOutputStream fos= new FileOutputStream("/Users/ram/JavaFiles/file1.txt");
			
			String message="My name is ram\nI live in colorado USA\nI am learning io programming\n";
			fos.write(message.getBytes());
			System.out.println("the file has been successfully written");
			fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
