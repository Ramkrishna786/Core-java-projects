package feb1AbstractInterface;

public class InterCircle implements InterShape {
	float radius; 

	@Override 
	public void calculateArea() { 

	System.out.println("Enter radius"); 
	radius = scr.nextFloat(); 
	float area = (PI * radius * radius); 
	System.out.println("Area of the Circle ="+ area); 
	}


}
