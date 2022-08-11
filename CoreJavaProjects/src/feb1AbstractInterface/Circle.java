package feb1AbstractInterface;

public class Circle extends Shape 
{
	float radius;

	@Override
	void calculateArea() 
	{
		System.out.println("enter the rdius of the circle");
		radius=scr.nextFloat();
		area=PI*radius*radius;
		System.out.println("Area of the circle"+area);
	}
	

}
