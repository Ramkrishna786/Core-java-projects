package MethodsImplemention;
import java.util.Scanner;

public class PersonalStudentMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of student details you wanna put");
		int studentNo=sc.nextInt();
		//declaring array of StudentDetails class
		StudentDetails studentArray[]=new StudentDetails[studentNo];
		
		for(int i=0;i<studentArray.length;i++)
		{
			//creating array object of StudentDetails class to setvalue.
			studentArray[i]= new StudentDetails();
			
			System.out.println("enter the student name");
			String name1=sc.next();
			studentArray[i].setName(name1);
			
			System.out.println("enter the phone number");
			long phone=sc.nextLong();
			studentArray[i].setPhoneNo(phone);
			
			System.out.println("enter the address");
			String address=sc.next();
			studentArray[i].setAddress(address);
			
			System.out.println("enter the student id");
			int id=sc.nextInt();
			studentArray[i].setStudentId(id);
			
			System.out.println("enter the student roll number");
			int roll=sc.nextInt();
			studentArray[i].setRollNo(roll);
			
			System.out.println("enter the student school name");
			String school= sc.next();
			studentArray[i].setSchoolName(school);
		}
		System.out.println("Name\tPhonenumber\tAddress\tStudentId\tRollno\tschoolName");
		System.out.println("===============================================================");
		
		for(int i=0;i<studentArray.length;i++)
		{
			System.out.println(studentArray[i].getName()+"\t"+studentArray[i].getPhoneNo()+"\t"+studentArray[i].getAddress()+"\t"+studentArray[i].getStudentId()+"\t"+studentArray[i].getRollNo()+"\t"+studentArray[i].getSchoolName());
		}
		
		sc.close();
	}

}
