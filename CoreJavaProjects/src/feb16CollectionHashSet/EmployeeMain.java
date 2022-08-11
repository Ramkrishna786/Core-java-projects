package feb16CollectionHashSet;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeMain {
	
	public static void main(String args[]) {
		
		HashSet<EmployeeHashSet> hashsetlist = new HashSet<>();
		Scanner sc= new Scanner(System.in);
		

		int choice; 
		do { 
		System.out.print(" 1. Add Employee"); 
		System.out.print(" 2. Display Employee"); 
		System.out.print(" 3. Search Employee");
		System.out.println(" 4. update Employee");
		System.out.print(" 5. Delete Employee");
		System.out.print(" 6. Exit"); 
		System.out.print(" 7. Enter the choice"); 
		choice = sc.nextInt(); 
		switch(choice) { 

		case 1: EmployeeController.addEmployee(hashsetlist, sc); 
		break; 

		case 2: EmployeeController.displayEmployee(hashsetlist, sc); 
		break; 

		case 3: EmployeeController.searchEmployee(hashsetlist, sc);
		break; 
		
		case 4: EmployeeController.updateEmployee(hashsetlist, sc); 
		break; 
		
		case 5: EmployeeController.deleteEmployee(hashsetlist, sc); 
		break; 
		
		default: if(choice != 6) 
		System.out.println("Invalid choice ... Try Again"); 

		} 

		}while(choice != 6); 

		System.out.println("You Are Exited from the Application"); 

		sc.close(); 


		
		
		
	}

}
