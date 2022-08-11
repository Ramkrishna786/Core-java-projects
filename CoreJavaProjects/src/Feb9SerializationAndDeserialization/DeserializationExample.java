package Feb9SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample 
{
	public static void main(String args[])
	{	
		try
		{
		FileInputStream fis= new FileInputStream("/Users/ram/JavaFiles/serialDserial.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println("PatientId\tPatientName\tPatientAddress");
		System.out.println("========================================");
		
		while(fis.available()!=0){
		Patient patient=(Patient)ois.readObject();
		System.out.println(patient.getPatientId()+"\t"+patient.getPatientName()+"\t"+patient.getPatientAddress());
		}
		/*Patient p1 = (Patient)ois.readObject(); 
		System.out.println(p1.getPatientId()+"\t"+p1.getPatientName()+"\t"+p1.getAddress()); 

		Patient p2 = (Patient)ois.readObject(); 
		System.out.println(p2.getPatientId()+"\t"+p2.getPatientName()+"\t"+p2.getAddress()); 

		Patient p3 = (Patient)ois.readObject(); 
		System.out.println(p3.getPatientId()+"\t"+p3.getPatientName()+"\t"+p3.getAddress());*/ 

		ois.close();
		}
		catch(IOException|ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
