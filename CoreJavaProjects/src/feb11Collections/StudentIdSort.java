package feb11Collections;

import java.util.Comparator;

public class StudentIdSort implements Comparator<StudentCollection>{

	@Override
	public int compare(StudentCollection c1, StudentCollection c2) {
		
		return c1.getStudentId()-c2.getStudentId();  //Ascending Order
		
		//return c2.getStudentId()-c1.getStudentId();  Descending order
	}
	
	

}
