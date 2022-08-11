package MethodsImplemention;

import java.util.Scanner;

public class EmployeeMain 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int value =sc.nextInt();
		Employee arr[]= new Employee [value];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= new Employee();
			
			System.out.println("enter the employee name");
			String name=sc.next();
			arr[i].setEmpName(name);
			
			System.out.println("enter the employee id");
			int id=sc.nextInt();
			arr[i].setEmpId(id);
			
			System.out.println("enter the employee phone");
			long phone=sc.nextLong();
			arr[i].setEmpPhone(phone);
			
			System.out.println("enter ther employee address");
			String address=sc.next();
			arr[i].setEmpAddress(address);	
		}
		System.out.println("Ename\tEid\tEphone\tEaddress");
		System.out.println("======================================");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getEmpName()+"\t"+arr[i].getEmpId()+"\t"+arr[i].getEmpPhone()+"\t"+arr[i].getEmpAddress());
		}
		
		
		sc.close();
	}
}
