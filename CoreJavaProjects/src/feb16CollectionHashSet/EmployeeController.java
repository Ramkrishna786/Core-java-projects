package feb16CollectionHashSet;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeController {
	
	public static void addEmployee(HashSet<EmployeeHashSet>hashsetlist,Scanner sc)
	{
		System.out.println("enter the employee id");
		int eId=sc.nextInt();
		
		System.out.println("enter the Employee name");
		String eName=sc.next();
		
		System.out.println("enter the Employee Address");
		String eAddress=sc.next();
		
		EmployeeHashSet hst = new EmployeeHashSet();
		hst.setEmployeeId(eId);
		hst.setEmployeeName(eName);
		hst.setEmployeeAddress(eAddress);
		hashsetlist.add(hst);
	}
	
	public static void printFormat()
	{
		System.out.println("Employeeid\tEmployeeName\tEmployeeAddress");
		System.out.println("=====================================================");
	}
	
	public static void displayEmployee(HashSet<EmployeeHashSet>hashsetlist,Scanner sc)
	{
		if(hashsetlist.isEmpty())
		{
			System.out.println("No student objects are available");
		}
		else
		{	printFormat();
			// for each loop ( datatype vairable : object of arraylist )
			for(EmployeeHashSet hst: hashsetlist)
			{
				System.out.println(hst.getEmployeeId()+"\t"+hst.getEmployeeName()+"\t"+hst.getEmployeeAddress());
			}
		}
	}
	
	public static void searchEmployee(HashSet<EmployeeHashSet>hashsetlist,Scanner sc)
	{
		boolean status= false;
		if(hashsetlist.isEmpty()) 
		{
			System.out.println("There is no emoloyee objects available");
		}
		else 
		{
			System.out.println("Enter the employee id");
			int id=sc.nextInt();
			for(EmployeeHashSet hst :hashsetlist) 
			{
				if(hst.getEmployeeId()==id) 
				{
					printFormat();
					System.out.println(hst.getEmployeeId()+"\t"+hst.getEmployeeName()+"\t"+hst.getEmployeeAddress());
					status=true;
					break;
				}
			}
			if(status==false) 
			{
				System.out.println("There is no employee objects available");
			}
		}
	}
	
	public static void updateEmployee(HashSet<EmployeeHashSet>hashsetlist, Scanner sc) 
	{
		boolean status=false;
		if(hashsetlist.isEmpty()) {
			System.out.println("There is no employee objects available");
		}
		else {
			System.out.println("Enter the employee id");
			int id=sc.nextInt();
			for(EmployeeHashSet hst: hashsetlist) {
				if(hst.getEmployeeId()==id) {
					System.out.println("Enter the student name");
					String name=sc.next();
					
					System.out.println("Enter the student Address");
					String address=sc.next();
					
					hst.setEmployeeName(name);		 //updating name
					hst.setEmployeeAddress(address); //updating address
					System.out.println("Records upadated successfully");
					status=true;
					break;
				}
			}
			if(status==false) {
				System.out.println("No employee  id found with"+id);
			}
		}
	} 
	
	public static void deleteEmployee(HashSet<EmployeeHashSet>hashsetlist, Scanner sc) {
		
		boolean status=false;
		if(hashsetlist.isEmpty()) {
			System.out.println("The whole employee list is empty");
		}else {
			System.out.println("Enter the employee id");
			int id=sc.nextInt();
			for(EmployeeHashSet hst: hashsetlist) {
				if(hst.getEmployeeId()==id) {
					hashsetlist.remove(hst);
					status=true;
					System.out.println("Recod has beeb deleted successfully");
					break;
				}
			}
			if(status==false) {
				System.out.println("no data available with the employee id"+id);
			}
		}
	}
}
