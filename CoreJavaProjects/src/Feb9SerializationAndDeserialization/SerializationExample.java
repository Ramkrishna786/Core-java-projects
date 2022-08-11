package Feb9SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationExample 
{

	public static void main(String args[])
	{
		/* Patient p1 = new Patient(100, "suman", "NJ"); 
		Patient p2 = new Patient(101, "raja", "NJ"); 
		Patient p3 = new Patient(102, "harish", "NJ"); 
		*/ 
		try {
		//creating a new file	
		FileOutputStream fos= new FileOutputStream("/Users/ram/JavaFiles/serialDserial.txt");
		//Creating object for serializaton and writing objects
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Scanner sc=new Scanner(System.in);
		String choice;
		
		do {
			System.out.println("Enter the patient id");
			int pid=sc.nextInt();
			
			System.out.println("Enter the patient name");
			String pName=sc.next();
			
			System.out.println("Enter the patient address");
			String pAddress=sc.next();
			
			Patient patientObj= new Patient(pid,pName,pAddress);
			oos.writeObject(patientObj);
			System.out.println("Object writing process has been finished");
			
			System.out.println("Do you want to add more datas..{yes or no }");
			choice=sc.next();	
		}while(choice.equalsIgnoreCase("yes"));
		oos.close();
		sc.close();
		}
		catch(IOException e)//Input and Output exception for file
		{
			e.printStackTrace();
		}
	}
}
