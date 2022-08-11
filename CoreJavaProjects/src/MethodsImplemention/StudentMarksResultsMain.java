package MethodsImplemention;
import java.util.Scanner;

public class StudentMarksResultsMain {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter ther numbner of student");
		int studentNo=sc.nextInt();
		StudentResult[] studentArray= new StudentResult[studentNo]; 
		
		for(int i=0;i<studentArray.length;i++)
		{
			studentArray[i]= new StudentResult();
			
			System.out.println("enter the student id");
			int studentId=sc.nextInt();
			studentArray[i].setStudentId(studentId);
			
			System.out.println("enter the student name");
			String studentName=sc.next();
			studentArray[i].setStudentName(studentName);
			
			System.out.println("enter the studnet department");
			String studnetDepartment=sc.next();
			studentArray[i].setStudentDepartment(studnetDepartment);
			
			System.out.println("enter the student marks in english");
			int marksEnglish=sc.nextInt();
			studentArray[i].setStudentMarksEnglish(marksEnglish);
			
			System.out.println("enter the marks in maths");
			int marksMaths=sc.nextInt();
			studentArray[i].setStudentMarksMaths(marksMaths);
			
			System.out.println("enter the marks in science");
			int marksScience=sc.nextInt();
			studentArray[i].setStudentMarksScience(marksScience);
			
			studentArray[i].getStudentDetails();
		}
		
		//sr.getStudentDetails();
		sc.close();
		
		for(int i=0;i<studentArray.length;i++)
		{
			System.out.println(studentArray[i].getStudentId()+"\t"+studentArray[i].getStudentName()+"\t"
					+studentArray[i].getStudentDepartment()+"\t"+studentArray[i].getTotal()+"\t"+studentArray[i].getAverage()
					+"\t"+studentArray[i].getGrade());
		}
	}

}
