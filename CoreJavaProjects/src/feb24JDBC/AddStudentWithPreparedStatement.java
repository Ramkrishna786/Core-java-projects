package feb24JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddStudentWithPreparedStatement {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_schema","root","ram12345");
		PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
		String choice;
		do {
			System.out.println("Enter the student id");
			int sId=sc.nextInt();
		
			System.out.println("Enter the student Name");
			String sName=sc.next();
		
			System.out.println("Enter the student course");
			String sCourse=sc.next();
			
			pst.setInt(1, sId);
			pst.setString(2,sName);
			pst.setString(3, sCourse);
			
			int result=pst.executeUpdate();
			
			if(result>0) {
				System.out.println("Data added to the table successfully");
			}
			
			System.out.println("Do you want to add some more records{Y/N}");
			choice=sc.next();
			}	while(choice.equalsIgnoreCase("y")); 
		
			
		sc.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();	
		}

	}

}
