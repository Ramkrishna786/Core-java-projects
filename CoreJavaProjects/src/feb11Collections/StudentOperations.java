package feb11Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperations {
	
	public static void addStudent(ArrayList<StudentCollection>studentList,Scanner sc)
	{
		System.out.println("enter the student id");
		int sId=sc.nextInt();
		
		System.out.println("enter the student name");
		String sName=sc.next();
		
		System.out.println("enter the student Address");
		String sAddress=sc.next();
		
		StudentCollection stcol = new StudentCollection();
		stcol.setStudentId(sId);
		stcol.setStudentName(sName);
		stcol.setStudentAddress(sAddress);
		
		studentList.add(stcol);
	}
	
	public static void printFormat()
	{
		System.out.println("Studentid\tStudentName\tStudentAddress");
		System.out.println("=====================================================");
	}
	
	public static void displayStudent(ArrayList<StudentCollection>studentList,Scanner sc)
	{
		if(studentList.isEmpty())
		{
			System.out.println("No student objects are available");
		}
		else
		{	printFormat();
			// for each loop ( datatype vairable : object of arraylist )
			for(StudentCollection sCol: studentList)
			{
				System.out.println(sCol.getStudentId()+"\t"+sCol.getStudentName()+"\t"+sCol.getStudentAddress());
			}
		}
	}
	
	public static void searchStudent(ArrayList<StudentCollection>studentList,Scanner sc)
	{
		boolean status= false;
		if(studentList.isEmpty()) 
		{
			System.out.println("There is no student objects available");
		}
		else 
		{
			System.out.println("Enter the student id");
			int id=sc.nextInt();
			for(StudentCollection scoll :studentList) 
			{
				if(scoll.getStudentId()==id) 
				{
					printFormat();
					System.out.println(scoll.getStudentId()+"\t"+scoll.getStudentName()+"\t"+scoll.getStudentAddress());
					status=true;
					break;
				}
			}
			if(status==false) 
			{
				System.out.println("There is no student objects available");
			}
		}
	}
	
	public static void updateStudent(ArrayList<StudentCollection>studentList, Scanner sc) 
	{
		boolean status=false;
		if(studentList.isEmpty()) {
			System.out.println("There is no customer objects available");
		}
		else {
			System.out.println("Enter the customer id");
			int id=sc.nextInt();
			for(StudentCollection scol: studentList) {
				if(scol.getStudentId()==id) {
					System.out.println("Enter the student name");
					String name=sc.next();
					
					System.out.println("Enter the student Address");
					String address=sc.next();
					
					scol.setStudentName(name);		//updating name
					scol.setStudentAddress(address);//updating address
					System.out.println("Records upadated successfully");
					status=true;
					break;
				}
			}
			if(status==false) {
				System.out.println("No Student id found with"+id);
			}
		}
	} 
	
	public static void deleteStudent(ArrayList<StudentCollection>studentList, Scanner sc) {
		
		boolean status=false;
		if(studentList.isEmpty()) {
			System.out.println("The whole student list is empty");
		}else {
			System.out.println("Enter the student id");
			int id=sc.nextInt();
			for(StudentCollection scol:studentList) {
				if(scol.getStudentId()==id) {
					studentList.remove(scol);
					status=true;
					System.out.println("Recod has beeb deleted successfully");
					break;
				}
			}
			if(status==false) {
				System.out.println("no data available with student id"+id);
			}
		}
	}
		
}
