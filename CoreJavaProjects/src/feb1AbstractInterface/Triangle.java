package feb1AbstractInterface;

public class Triangle extends Shape

{
	float base;
	float height;

	@Override
	void calculateArea()
	{
		System.out.println("enter the base of the triangle");
		base=scr.nextFloat();
		
		System.out.println("enter the height of the triangle");
		height=scr.nextFloat();
		
		area=(base*height)/2;
		
		System.out.println("The area of the triangle is "+area);
		
	}

}
