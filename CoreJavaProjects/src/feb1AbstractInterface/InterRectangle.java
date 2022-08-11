package feb1AbstractInterface;

public class InterRectangle implements InterShape {
	
	float length, breadth; 
	@Override 
	public void calculateArea() { 

	System.out.println("Enter length of the Rectangle"); 
	length = scr.nextFloat(); 

	System.out.println("Enter breadth of the Triangle"); 
	breadth = scr.nextFloat(); 

	System.out.println("Area of the Rectangle is "+ (length * breadth)); 
	} 

	


}
