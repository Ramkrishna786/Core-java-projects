package feb24JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudentWithPreparedStatement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_schema","root","ram12345");
			PreparedStatement pst=con.prepareStatement("delete from student where s_id=?");
			
			System.out.println("Enter the student id");
			int eid=sc.nextInt();
			
			pst.setInt(1, eid);
			int result=pst.executeUpdate();
			
			if( result>0) {
				System.out.println("Data from the table has been deleted successfully");	
			}else {
				System.out.println("Data not found from the table");
			}
			sc.close();
		
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	
	}

}
