package feb1AbstractInterface;

public class AbstractFactory 
{
	public static Shape getShapeObject(String shapeName) { 

		if(shapeName.equalsIgnoreCase("Circle")) 
		{ 
		return new Circle(); 
		} 
		if(shapeName.equalsIgnoreCase("Triangle"))
		{ 
		return new Triangle(); 
		} 
		return null; 
		} 


}
