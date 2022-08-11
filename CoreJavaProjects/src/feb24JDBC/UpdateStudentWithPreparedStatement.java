package feb24JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudentWithPreparedStatement {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_schema","root","ram12345");
			PreparedStatement pst=con.prepareStatement("update student set s_id=?,s_name=?,s_course=? where s_id=? ");
			
			System.out.println("Enter student id to update the details"); 
			int sid = sc.nextInt(); 

			System.out.println("Enter updated name"); 
			String sname = sc.next(); 

			System.out.println("Enter new Course"); 
			String scourse = sc.next(); 

			pst.setString(1, sname); 
			pst.setString(2, scourse); 
			pst.setInt(3, sid); 

			int result = pst.executeUpdate(); 
			if(result > 0) { 
				System.out.println("Record updated successfully.."); 
				} else { 
				System.out.println("No record found .."); 
				} 

				con.close(); 
			sc.close();

			
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		

	}

}
