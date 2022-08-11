package feb1AbstractInterface;


public class InterfaceFactory {
	
	public static InterShape getInterShapeObject(String shapeName) { 

		if(shapeName.equalsIgnoreCase("Rectangle"))
		{ 
         return new InterRectangle(); 
		} 

		if(shapeName.equalsIgnoreCase("Circle")) 
		{ 
		return new InterCircle(); 
		} 

		return null; 
		} 


}
