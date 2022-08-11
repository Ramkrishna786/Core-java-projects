package feb24JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class RetriveStudentWithPreparedStatements {
	
	public static void main(String args[]) {
		
		Scanner scr= new Scanner(System.in);
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_schema","root","ram12345");
		PreparedStatement pst = con.prepareStatement("select * from student order by s_name desc"); 
		ResultSet rs=pst.executeQuery();
		ResultSetMetaData md=(ResultSetMetaData) rs.getMetaData();
		
		for (int i = 1; i <= md.getColumnCount(); i++) { // displaying columns 

			System.out.print(md.getColumnName(i).toUpperCase()+"\t"); 

			} 
		// displaying rows 
		System.out.println("\n-------------------------------------------"); 

		while(rs.next()) { // checks that row is available or not 

		for (int i = 1; i <= md.getColumnCount(); i++) { // displaying columns 

		System.out.print(rs.getString(i)+"\t"); 

		} 
		try { 
			Thread.sleep(1000); 
			} catch (InterruptedException e) { 
			e.printStackTrace(); 
			} 
		System.out.println();
		}
		
		scr.close();
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}

}
