package feb11Collections;

import java.util.Comparator;

public class StudentNameSort implements Comparator<StudentCollection> {

	@Override
	public int compare(StudentCollection c1, StudentCollection c2) {
		
		return c1.getStudentName().compareTo(c2.getStudentName()); //Ascending order
		
		//return c2.getStudentName().compareTo(c1.getStudentName());   desending order
	}


}
