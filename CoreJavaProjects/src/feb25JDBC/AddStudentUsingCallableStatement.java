package feb25JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class AddStudentUsingCallableStatement {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_schema","root","ram12345");
			CallableStatement cst= con.prepareCall("{call addstudent_procedure(?,?,?)}");
			
			System.out.println("Enter Student Id"); 
			int sid = scr.nextInt(); 

			System.out.println("Enter student name"); 
			String sname = scr.next(); 

			System.out.println("Enter Student course"); 
			String scourse = scr.next(); 

			cst.setInt(1, sid); 
			cst.setString(2, sname); 
			cst.setString(3, scourse); 
			
			int result = cst.executeUpdate(); 
			if(result > 0) { 

			System.out.println("Record inserted successfully..."); 
			} 
			scr.close();
		
		}catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
			
		}

	}

}
