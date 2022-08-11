package feb11Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {
	public static void main(String args[])
	{
		ArrayList<StudentCollection> studentList = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		
		int choice; 
		do { 
		System.out.print(" 1. Add Customer"); 
		System.out.print(" 2. Display Customers"); 
		System.out.print(" 3. Search Customer");
		System.out.print(" 4. update Customer");
		System.out.println(" 5. Delete Customer");
		System.out.print(" 6. Sorting customer Id");
		System.out.print(" 7. Sorting customer Name");
		System.out.print(" 8. Exit"); 
		System.out.print(" 9. Enter the choice"); 
		choice = sc.nextInt(); 
		switch(choice) { 

		case 1: StudentOperations.addStudent(studentList, sc); 
		break; 

		case 2: StudentOperations.displayStudent(studentList,sc); 
		break; 

		case 3: StudentOperations.searchStudent(studentList, sc); 
		break; 
		
		case 4: StudentOperations.updateStudent(studentList, sc); 
		break; 
		
		case 5: StudentOperations.deleteStudent(studentList, sc); 
		break; 
		
		case 6: Collections.sort(studentList,new StudentIdSort());
				System.out.println("Sorting id done by Id");
				StudentOperations.displayStudent(studentList,sc);
		break;
		
		case 7: Collections.sort(studentList,new StudentNameSort());
				System.out.println("Sorting is done by name");
				StudentOperations.displayStudent(studentList,sc);
		break;

		default: if(choice != 8) 
		System.out.println("Invalid choice ... Try Again"); 

		} 

		}while(choice != 8); 

		System.out.println("You Are Exited from the Application"); 

		sc.close(); 


	}

}
