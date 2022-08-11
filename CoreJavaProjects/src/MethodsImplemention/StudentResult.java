package MethodsImplemention;

public class StudentResult  extends StudentMarks
{	
	int total;
	float average;
	String grade;
	
	
	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public float getAverage() {
		return average;
	}


	public void setAverage(float average) {
		this.average = average;
	}


	public String getGrade() {
		return grade;
	}


	public void setGarade(String grade) {
		this.grade = grade;
	}


	void getStudentDetails()
	{
		total = getStudentMarksEnglish()+getStudentMarksMaths()+getStudentMarksScience();
		average= total/3f;
		
		if(getStudentMarksEnglish()<40||getStudentMarksMaths()<40||getStudentMarksScience()<40)
		{
			grade="fail";			
		}
		else if(average>85)
		{
			grade="Distinction";
		}
		else if(average>60)
		{
			grade="First Division";
		}	
		else if(average>50)
		{
			grade="Second Division";
		}
		else
		{
			grade="Third Division";
		}
		
	}
}
